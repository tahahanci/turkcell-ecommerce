package com.tahahanci.turkcell_ecommerce.services.concretes;

import com.tahahanci.turkcell_ecommerce.core.exception.types.BusinessException;
import com.tahahanci.turkcell_ecommerce.core.services.abstracts.MessageService;
import com.tahahanci.turkcell_ecommerce.entities.Product;
import com.tahahanci.turkcell_ecommerce.repositories.abstracts.ProductRepository;
import com.tahahanci.turkcell_ecommerce.services.abstracts.ProductService;
import com.tahahanci.turkcell_ecommerce.entities.Category;
import com.tahahanci.turkcell_ecommerce.services.constants.Messages;
import com.tahahanci.turkcell_ecommerce.services.dtos.product.requests.AddProductRequest;
import com.tahahanci.turkcell_ecommerce.services.dtos.product.responses.ProductListResponse;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService
{
    private ProductRepository productRepository;
    private final MessageService messageService;

    public ProductServiceImpl(ProductRepository productRepository, MessageService messageService) {
        this.productRepository = productRepository;
        this.messageService = messageService;
    }

    @Override
    public void add(AddProductRequest request) {
        // Aynı ürün isminden 2. ürün eklenemez.
        productWithSameNameShouldNotExists(request.getName());
        // TODO: Check from db
        Category category = new Category();
        category.setId(request.getCategory_id());

        // Mapping -> Manual
        // TODO: Auto Mapping
        Product product = new Product();
        product.setName(request.getName());
        product.setDescription(request.getDescription());
        product.setPrice(request.getPrice());
        product.setStock_quantity(request.getStock_quantity());
        product.setCategory(category);
        productRepository.save(product);

    }

    private void productWithSameNameShouldNotExists(String name) {
        Optional<Product> productWithSameName =
                productRepository.findByName(name);
        if(productWithSameName.isPresent())
            throw new BusinessException(messageService.getMessageWithArgs(Messages.BusinessErrors.SAME_PRODUCT_ERROR, name));
    }

    @Override
    public List<ProductListResponse> getAll() {
        List<Product> products = productRepository.findAll();
        return getProductListResponses(products);
    }

    @Override
    public List<ProductListResponse> listByAscendingPrice() {
        List<Product> products = productRepository.listByAscendingPrice();
        return getProductListResponses(products);
    }

    @Override
    public ProductListResponse getMostExpensive() {
        Product product = productRepository.getMostExpensiveProduct();
        return new ProductListResponse(
                product.getId(),
                product.getName(),
                product.getDescription(),
                product.getPrice(),
                product.getCategory().getName()
        );

    }

    @Override
    public double getAveragePrice() {
        return productRepository.getAveragePrice();
    }

    @Override
    public List<ProductListResponse> getProductsByCategoryName(String categoryName) {
        List<Product> products = productRepository.getProductsByCategoryName(categoryName);

        List<ProductListResponse> response = new ArrayList<>();
        for (Product product: products) {
            ProductListResponse dto = new ProductListResponse(
                    product.getId(),
                    product.getName(),
                    product.getDescription(),
                    product.getPrice(),
                    product.getCategory().getName()
            );
            response.add(dto);
        }

        return response;

    }

    @Override
    public int getNumberOfProductsByBrandName(String brandName) {
        return productRepository.getNumberOfProductsByBrandName(brandName);
    }

    private List<ProductListResponse> getProductListResponses(List<Product> products) {
        List<ProductListResponse> response = new ArrayList<>();

        for (Product product: products) {
            ProductListResponse dto = new ProductListResponse(
                    product.getId(),
                    product.getName(),
                    product.getDescription(),
                    product.getPrice(),
                    product.getCategory().getName()
            );
            response.add(dto);
        }
        return response;
    }
}
