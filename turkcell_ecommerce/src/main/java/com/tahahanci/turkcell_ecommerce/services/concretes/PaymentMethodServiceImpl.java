package com.tahahanci.turkcell_ecommerce.services.concretes;

import com.tahahanci.turkcell_ecommerce.entities.PaymentMethod;
import com.tahahanci.turkcell_ecommerce.repositories.abstracts.PaymentMethodRepository;
import com.tahahanci.turkcell_ecommerce.services.abstracts.PaymentMethodService;
import com.tahahanci.turkcell_ecommerce.services.dtos.paymentmethod.requests.PaymentMethodAddRequest;
import com.tahahanci.turkcell_ecommerce.services.dtos.paymentmethod.responses.PaymentMethodListResponse;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PaymentMethodServiceImpl implements PaymentMethodService {
    private final PaymentMethodRepository paymentMethodRepository;

    public PaymentMethodServiceImpl(PaymentMethodRepository paymentMethodRepository) {
        this.paymentMethodRepository = paymentMethodRepository;
    }

    @Override
    public List<PaymentMethodListResponse> getAll() {
        List<PaymentMethod> paymentMethods = paymentMethodRepository.findAll();
        List<PaymentMethodListResponse> paymentMethodListResponses = new ArrayList<>();
        for (PaymentMethod paymentMethod : paymentMethods)
        {
            PaymentMethodListResponse p = new PaymentMethodListResponse(paymentMethod.getId(), paymentMethod.getPaymentMethod());
            paymentMethodListResponses.add(p);
        }
        return paymentMethodListResponses;
    }

    @Override
    public void add(PaymentMethodAddRequest paymentMethodAddRequest) {
        PaymentMethod paymentMethod = new PaymentMethod();
        paymentMethod.setPaymentMethod(paymentMethodAddRequest.getName());
        paymentMethodRepository.save(paymentMethod);
    }

    @Override
    public void deleteById(int id) {
        paymentMethodRepository.deleteById(id);
    }

    @Override
    public Optional<PaymentMethod> getById(int id) {
        return paymentMethodRepository.findById(id);
    }
}
