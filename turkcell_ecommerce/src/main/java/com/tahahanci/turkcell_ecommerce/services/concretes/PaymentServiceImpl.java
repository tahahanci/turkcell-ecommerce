package com.tahahanci.turkcell_ecommerce.services.concretes;

import com.tahahanci.turkcell_ecommerce.entities.Order;
import com.tahahanci.turkcell_ecommerce.entities.Payment;
import com.tahahanci.turkcell_ecommerce.entities.PaymentMethod;
import com.tahahanci.turkcell_ecommerce.repositories.abstracts.OrderRepository;
import com.tahahanci.turkcell_ecommerce.repositories.abstracts.PaymentMethodRepository;
import com.tahahanci.turkcell_ecommerce.repositories.abstracts.PaymentRepository;
import com.tahahanci.turkcell_ecommerce.services.abstracts.PaymentService;
import com.tahahanci.turkcell_ecommerce.services.dtos.payment.requests.PaymentAddRequest;
import com.tahahanci.turkcell_ecommerce.services.dtos.payment.responses.PaymentListResponse;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PaymentServiceImpl implements PaymentService {

    private final PaymentRepository paymentRepository;
    private final OrderRepository orderRepository;

    private final PaymentMethodRepository paymentMethodRepository;


    public PaymentServiceImpl(PaymentRepository paymentRepository, OrderRepository orderRepository, PaymentMethodRepository paymentMethodRepository) {
        this.paymentRepository = paymentRepository;
        this.orderRepository = orderRepository;
        this.paymentMethodRepository = paymentMethodRepository;
    }


    @Override
    public List<PaymentListResponse> getAll() {
        List<PaymentListResponse> paymentListResponses = new ArrayList<>();
        List<Payment> payments = paymentRepository.findAll();

        for (Payment payment : payments) {
            PaymentListResponse paymentListResponse = new PaymentListResponse();
            paymentListResponse.setOrder(payment.getOrder());
            paymentListResponse.setPaymentMethod(payment.getPaymentMethod());
            paymentListResponses.add(paymentListResponse);
        }
        return paymentListResponses;

    }

    @Override
    public void add(PaymentAddRequest paymentAddRequest) {
        //find order from id
        Order order = orderRepository.findById(paymentAddRequest.getOrderId()).orElseThrow();

        //find payment method from id
        PaymentMethod paymentMethod = paymentMethodRepository.findById(paymentAddRequest.getPaymentMethodId()).orElseThrow();

        //create payment
        Payment payment = new Payment();
        payment.setOrder(order);
        payment.setPaymentMethod(paymentMethod);

        //save payment
        paymentRepository.save(payment);

    }
}
