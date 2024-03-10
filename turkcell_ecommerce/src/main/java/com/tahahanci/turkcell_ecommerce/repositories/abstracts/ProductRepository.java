package com.tahahanci.turkcell_ecommerce.repositories.abstracts;

import com.tahahanci.turkcell_ecommerce.entities.Product;
import com.tahahanci.turkcell_ecommerce.services.dtos.product.responses.ProductListResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Integer>
{

    @Query("SELECT p FROM Product p ORDER BY p.price ASC")
    List<Product> listByAscendingPrice();

    List<Product> findByPriceGreaterThanEqual(double price);

    Optional<Product> findByName(String name);

    @Query("SELECT p FROM Product p ORDER BY p.price DESC LIMIT 1")
    Product getMostExpensiveProduct();

}