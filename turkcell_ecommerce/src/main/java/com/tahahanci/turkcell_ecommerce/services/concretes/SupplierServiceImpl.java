package com.tahahanci.turkcell_ecommerce.services.concretes;

import com.tahahanci.turkcell_ecommerce.entities.Supplier;
import com.tahahanci.turkcell_ecommerce.repositories.abstracts.SupplierRepository;
import com.tahahanci.turkcell_ecommerce.services.abstracts.SupplierService;
import com.tahahanci.turkcell_ecommerce.services.dtos.supplier.requests.SupplierAddRequest;
import com.tahahanci.turkcell_ecommerce.services.dtos.supplier.responses.SupplierListResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierServiceImpl implements SupplierService{

    private final SupplierRepository supplierRepository;

    public SupplierServiceImpl(SupplierRepository supplierRepository) {
        this.supplierRepository = supplierRepository;
    }

    @Override
    public List<SupplierListResponse> getAll() {
        List<Supplier> suppliers = supplierRepository.findAll();
        List<SupplierListResponse> supplierListResponses = null;

        for (Supplier supplier : suppliers) {
            supplierListResponses.add(new SupplierListResponse(supplier.getSupplierName(), supplier.getSupplierPhoneNumber(), supplier.getSupplierMail()));
        }

        return supplierListResponses;
    }

    @Override
    public void add(SupplierAddRequest addSupplierRequest) {
        Supplier supplier = new Supplier();
        supplier.setSupplierName(addSupplierRequest.getSupplierName());
        supplier.setSupplierPhoneNumber(addSupplierRequest.getSupplierPhoneNumber());
        supplier.setSupplierMail(addSupplierRequest.getSupplierMail());
        supplier.setSupplierPassword(addSupplierRequest.getSupplierPassword());

        supplierRepository.save(supplier);
    }
}
