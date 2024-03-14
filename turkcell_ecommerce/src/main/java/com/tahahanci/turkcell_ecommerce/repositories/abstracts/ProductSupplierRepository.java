package com.tahahanci.turkcell_ecommerce.repositories.abstracts;

import com.tahahanci.turkcell_ecommerce.entities.ProductSupplier;
import com.tahahanci.turkcell_ecommerce.services.dtos.productsupplier.response.ProductSupplierListResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface ProductSupplierRepository extends JpaRepository<ProductSupplier, Integer> {

    @Query(value = "select new com.tahahanci.turkcell_ecommerce.services.dtos.productsupplier.response.ProductSupplierListResponse(" +
            "p.supplier.supplierName, p.product.name)" +
            "from ProductSupplier p JOIN p.product pr")
    List<ProductSupplierListResponse> searchDto();

}
