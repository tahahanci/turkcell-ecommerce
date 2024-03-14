package com.tahahanci.turkcell_ecommerce.services.abstracts;

import com.tahahanci.turkcell_ecommerce.entities.PaymentMethod;
import com.tahahanci.turkcell_ecommerce.services.dtos.paymentmethod.requests.PaymentMethodAddRequest;
import com.tahahanci.turkcell_ecommerce.services.dtos.paymentmethod.responses.PaymentMethodListResponse;

import java.util.List;
import java.util.Optional;

public interface PaymentMethodService {
    List<PaymentMethodListResponse> getAll();

    void add(PaymentMethodAddRequest paymentMethodAddRequest);

    void deleteById(int id);

    Optional<PaymentMethod> getById(int id);

}
