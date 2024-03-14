package com.tahahanci.turkcell_ecommerce.services.abstracts;

import com.tahahanci.turkcell_ecommerce.services.dtos.discount.requests.DiscountAddRequest;
import com.tahahanci.turkcell_ecommerce.services.dtos.discount.responses.DiscountListResponse;

import java.util.List;

public interface DiscountService {
    List<DiscountListResponse> getAll();

    void add(DiscountAddRequest discountAddRequest);
}
