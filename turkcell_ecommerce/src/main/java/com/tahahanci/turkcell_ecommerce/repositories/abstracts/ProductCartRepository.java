package com.tahahanci.turkcell_ecommerce.repositories.abstracts;

import com.tahahanci.turkcell_ecommerce.entities.ProductCart;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductCartRepository extends JpaRepository<ProductCart, Integer> {

    List<ProductCart> getProductCartByCart_Id(int cartId);
}
