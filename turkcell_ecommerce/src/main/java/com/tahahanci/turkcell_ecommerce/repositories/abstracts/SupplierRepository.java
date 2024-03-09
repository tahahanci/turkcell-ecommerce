package com.tahahanci.turkcell_ecommerce.repositories.abstracts;

import com.tahahanci.turkcell_ecommerce.entities.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepository extends JpaRepository<Supplier, Integer> {
}
