package com.tahahanci.turkcell_ecommerce.controllers;
import com.tahahanci.turkcell_ecommerce.services.dtos.payment.requests.PaymentAddRequest;
import com.tahahanci.turkcell_ecommerce.services.dtos.payment.responses.PaymentListResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;
import java.util.List;

import com.tahahanci.turkcell_ecommerce.services.abstracts.PaymentService;


@RestController
@RequestMapping("/api/payments")
public class PaymentsController {
    private final PaymentService paymentService;

    public PaymentsController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @GetMapping
    public List<PaymentListResponse> getAll() {
        return paymentService.getAll();
    }

    @PostMapping
    void add(@RequestBody @Valid PaymentAddRequest paymentAddRequest) {
        paymentService.add(paymentAddRequest);
    }
}