package com.tahahanci.turkcell_ecommerce.repositories.abstracts;

import com.tahahanci.turkcell_ecommerce.entities.Discount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiscountRepository extends JpaRepository<Discount, Integer> {
}
