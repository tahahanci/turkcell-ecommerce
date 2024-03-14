package com.tahahanci.turkcell_ecommerce.controllers;

import com.tahahanci.turkcell_ecommerce.entities.PaymentMethod;
import com.tahahanci.turkcell_ecommerce.services.abstracts.PaymentMethodService;
import com.tahahanci.turkcell_ecommerce.services.dtos.paymentmethod.requests.PaymentMethodAddRequest;
import com.tahahanci.turkcell_ecommerce.services.dtos.paymentmethod.responses.PaymentMethodListResponse;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/paymentmethods")
public class PaymentMethodsController {
    private final PaymentMethodService paymentMethodService;

    public PaymentMethodsController(PaymentMethodService paymentMethodService) {
        this.paymentMethodService = paymentMethodService;
    }

    @GetMapping()
    List<PaymentMethodListResponse> getAll() {
        return paymentMethodService.getAll();
    }

    @PostMapping
    void add(@RequestBody @Valid PaymentMethodAddRequest paymentMethodAddRequest) {
        paymentMethodService.add(paymentMethodAddRequest);
    }

    @DeleteMapping("/{id}")
    void deleteById(@PathVariable int id) {
        paymentMethodService.deleteById(id);
    }

    @GetMapping("/{id}")
    Optional<PaymentMethod> getById(@PathVariable int id) {
        return paymentMethodService.getById(id);
    }
}