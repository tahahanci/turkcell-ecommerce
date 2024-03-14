package com.tahahanci.turkcell_ecommerce.controllers;

import com.tahahanci.turkcell_ecommerce.services.abstracts.SupplierService;
import com.tahahanci.turkcell_ecommerce.services.dtos.supplier.requests.SupplierAddRequest;
import com.tahahanci.turkcell_ecommerce.services.dtos.supplier.responses.SupplierListResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/suppliers")
public class SuppliersController {

    private SupplierService supplierService;

    public SuppliersController(SupplierService supplierService) {
        this.supplierService = supplierService;
    }

    @GetMapping("/getAll")
    List<SupplierListResponse> getAll(){
        return supplierService.getAll();
    }
    @PostMapping("/addSupplier")
    public void add(@RequestBody SupplierAddRequest addSupplierRequest){
        supplierService.add(addSupplierRequest);

    }

}