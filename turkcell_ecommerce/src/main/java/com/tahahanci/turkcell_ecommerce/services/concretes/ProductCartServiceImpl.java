package com.tahahanci.turkcell_ecommerce.services.concretes;

import com.tahahanci.turkcell_ecommerce.entities.Cart;
import com.tahahanci.turkcell_ecommerce.entities.Product;
import com.tahahanci.turkcell_ecommerce.entities.ProductCart;
import com.tahahanci.turkcell_ecommerce.repositories.abstracts.CartRepository;
import com.tahahanci.turkcell_ecommerce.repositories.abstracts.ProductCartRepository;
import com.tahahanci.turkcell_ecommerce.repositories.abstracts.ProductRepository;
import com.tahahanci.turkcell_ecommerce.services.abstracts.ProductCartService;
import com.tahahanci.turkcell_ecommerce.services.dtos.productcart.requests.ProductCartAddRequest;
import com.tahahanci.turkcell_ecommerce.services.dtos.productcart.responses.ProductCartListResponse;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class ProductCartServiceImpl implements ProductCartService{
    private final ProductCartRepository productCartRepository;
    private final CartRepository cartRepository;
    private final ProductRepository productRepository;


    public ProductCartServiceImpl(ProductCartRepository productCartRepository, CartRepository cartRepository, ProductRepository productRepository) {
        this.productCartRepository = productCartRepository;
        this.cartRepository = cartRepository;
        this.productRepository = productRepository;
    }

    @Override
    public void add(ProductCartAddRequest productCart) {
        ProductCart productCart1 = new ProductCart();
        Cart cart = cartRepository.findById(productCart.getCartId()).get();
        Product product = productRepository.findById(productCart.getProductId()).get();

        productCart1.setCart(cart);
        productCart1.setProduct(product);

        productCartRepository.save(productCart1);
    }

    @Override
    public List<ProductCartListResponse> getAll() {
        List <ProductCart> productCarts = productCartRepository.findAll();
        List<ProductCartListResponse> productCartListResponses = new ArrayList<>();

        for (ProductCart productCart : productCarts) {
            ProductCartListResponse productCartListResponse = new ProductCartListResponse();
            productCartListResponse.setId(productCart.getId());
            productCartListResponse.setCart(productCart.getCart());
            productCartListResponse.setProduct(productCart.getProduct());
            productCartListResponses.add(productCartListResponse);
        }


        return productCartListResponses;
    }

    @Override
    public List<ProductCart> getByCartId(int cartId) {
        return productCartRepository.getProductCartByCart_Id(cartId);
    }
}
