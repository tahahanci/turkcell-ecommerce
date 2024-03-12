package com.tahahanci.turkcell_ecommerce.services.concretes;

import com.tahahanci.turkcell_ecommerce.entities.Product;
import com.tahahanci.turkcell_ecommerce.entities.ProductCart;
import com.tahahanci.turkcell_ecommerce.repositories.abstracts.ProductCartRepository;
import com.tahahanci.turkcell_ecommerce.services.abstracts.ProductCartService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductCartServiceImpl implements ProductCartService{
    private final ProductCartRepository productCartRepository;

    public ProductCartServiceImpl(ProductCartRepository productCartRepository) {
        this.productCartRepository = productCartRepository;
    }

    @Override
    public void add(ProductCart productCart) {
        productCartRepository.save(productCart);
    }

    @Override
    public List<ProductCart> getAll() {
        return productCartRepository.findAll();
    }

    @Override
    public List<ProductCart> getByCartId(int cartId) {
        return productCartRepository.getProductCartByCart_Id(cartId);
    }
}
