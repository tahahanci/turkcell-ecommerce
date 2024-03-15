package com.tahahanci.turkcell_ecommerce.services.mappers;

import com.tahahanci.turkcell_ecommerce.entities.Brand;
import com.tahahanci.turkcell_ecommerce.entities.Category;
import com.tahahanci.turkcell_ecommerce.entities.Product;
import com.tahahanci.turkcell_ecommerce.services.dtos.product.requests.AddProductRequest;
import com.tahahanci.turkcell_ecommerce.services.dtos.product.responses.ProductListResponse;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-03-15T20:54:48+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.1 (Oracle Corporation)"
)
@Component
public class ProductMapperImpl implements ProductMapper {

    @Override
    public Product productFromAddRequest(AddProductRequest request) {
        if ( request == null ) {
            return null;
        }

        Product product = new Product();

        product.setCategory( addProductRequestToCategory( request ) );
        product.setBrand( addProductRequestToBrand( request ) );
        product.setName( request.getName() );
        product.setDescription( request.getDescription() );
        product.setPrice( request.getPrice() );
        product.setStock_quantity( request.getStock_quantity() );

        return product;
    }

    @Override
    public ProductListResponse productToProductListResponse(Product product) {
        if ( product == null ) {
            return null;
        }

        ProductListResponse productListResponse = new ProductListResponse();

        productListResponse.setCategoryName( productCategoryName( product ) );
        productListResponse.setId( product.getId() );
        productListResponse.setName( product.getName() );
        productListResponse.setDescription( product.getDescription() );
        productListResponse.setPrice( product.getPrice() );

        return productListResponse;
    }

    protected Category addProductRequestToCategory(AddProductRequest addProductRequest) {
        if ( addProductRequest == null ) {
            return null;
        }

        Category category = new Category();

        category.setId( addProductRequest.getCategory_id() );

        return category;
    }

    protected Brand addProductRequestToBrand(AddProductRequest addProductRequest) {
        if ( addProductRequest == null ) {
            return null;
        }

        Brand brand = new Brand();

        brand.setId( addProductRequest.getBrand_id() );

        return brand;
    }

    private String productCategoryName(Product product) {
        if ( product == null ) {
            return null;
        }
        Category category = product.getCategory();
        if ( category == null ) {
            return null;
        }
        String name = category.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }
}
