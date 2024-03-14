package com.tahahanci.turkcell_ecommerce.controllers;
import com.tahahanci.turkcell_ecommerce.services.dtos.payment.requests.PaymentAddRequest;
import com.tahahanci.turkcell_ecommerce.services.dtos.payment.responses.PaymentListResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;
import java.util.List;

import com.tahahanci.turkcell_ecommerce.services.abstracts.PaymentService;


@RestController
@AllArgsConstructor
@RequestMapping("/api/payments")
public class PaymentsController {
    private final PaymentService paymentService;

    @GetMapping
    public List<PaymentListResponse> getAll() {
        return paymentService.getAll();
    }

    @PostMapping
    void add(@RequestBody @Valid PaymentAddRequest paymentAddRequest) {
        paymentService.add(paymentAddRequest);
    }
}