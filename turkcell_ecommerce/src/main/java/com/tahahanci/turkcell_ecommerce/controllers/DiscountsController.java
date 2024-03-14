package com.tahahanci.turkcell_ecommerce.controllers;

import com.tahahanci.turkcell_ecommerce.services.abstracts.DiscountService;
import com.tahahanci.turkcell_ecommerce.services.dtos.discount.requests.DiscountAddRequest;
import com.tahahanci.turkcell_ecommerce.services.dtos.discount.responses.DiscountListResponse;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/discounts")
public class DiscountsController {

    private final DiscountService discountService;

    public DiscountsController(DiscountService discountService) {
        this.discountService = discountService;
    }

    @GetMapping
    public List<DiscountListResponse> getAll() {
        return discountService.getAll();
    }

    @PostMapping
    void add(@RequestBody @Valid DiscountAddRequest discountAddRequest) {
        discountService.add(discountAddRequest);
    }


}
