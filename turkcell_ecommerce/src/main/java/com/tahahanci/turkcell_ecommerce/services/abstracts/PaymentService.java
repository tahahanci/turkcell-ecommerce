package com.tahahanci.turkcell_ecommerce.services.abstracts;

import com.tahahanci.turkcell_ecommerce.services.dtos.payment.requests.PaymentAddRequest;
import com.tahahanci.turkcell_ecommerce.services.dtos.payment.responses.PaymentListResponse;

import java.util.List;

public interface PaymentService {
    List<PaymentListResponse> getAll();

    void add(PaymentAddRequest paymentAddRequest);
}
