package com.tahahanci.turkcell_ecommerce.services.concretes;

import com.tahahanci.turkcell_ecommerce.entities.Discount;
import com.tahahanci.turkcell_ecommerce.repositories.abstracts.DiscountRepository;
import com.tahahanci.turkcell_ecommerce.repositories.abstracts.ProductSupplierRepository;
import com.tahahanci.turkcell_ecommerce.services.abstracts.DiscountService;
import com.tahahanci.turkcell_ecommerce.services.dtos.discount.requests.DiscountAddRequest;
import com.tahahanci.turkcell_ecommerce.services.dtos.discount.responses.DiscountListResponse;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DiscountServiceImpl implements DiscountService {

    private final DiscountRepository discountRepository;
    private final ProductSupplierRepository productSupplierRepository;

    public DiscountServiceImpl(DiscountRepository discountRepository, ProductSupplierRepository productSupplierRepository) {
        this.discountRepository = discountRepository;
        this.productSupplierRepository = productSupplierRepository;
    }


    @Override
    public List<DiscountListResponse> getAll() {
        List<Discount> discounts = discountRepository.findAll(); //find all discounts
        List<DiscountListResponse> discountListResponses = new ArrayList<>(); // create a list to store discountListResponses

        String supplierName;
        String productName;

        for (Discount discount : discounts) {
            supplierName = discount.getProductSupplier().getSupplier().getSupplierName();
            productName = discount.getProductSupplier().getProduct().getName();
            discountListResponses.add(new DiscountListResponse(supplierName, productName, discount.getDiscountRate()));
        }
        return discountListResponses;
    }

    @Override
    public void add(DiscountAddRequest discountAddRequest) {
        Discount discount = new Discount();
        discount.setDiscountRate(discountAddRequest.getDiscountRate());
        discount.setProductSupplier(productSupplierRepository.getById(discountAddRequest.getProductSupplierID()));
        discountRepository.save(discount);
    }
}
