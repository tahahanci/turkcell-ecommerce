package com.tahahanci.turkcell_ecommerce.services.dtos.payment.responses;

import com.tahahanci.turkcell_ecommerce.entities.Order;
import com.tahahanci.turkcell_ecommerce.entities.PaymentMethod;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class PaymentListResponse {
    private Order order;
    private PaymentMethod paymentMethod;

    public PaymentListResponse() {
    }

    public PaymentListResponse(Order order, PaymentMethod paymentMethod) {
        this.order = order;
        this.paymentMethod = paymentMethod;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

}
