package com.tahahanci.turkcell_ecommerce.services.dtos.payment.responses;

import com.tahahanci.turkcell_ecommerce.entities.Order;
import com.tahahanci.turkcell_ecommerce.entities.PaymentMethod;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PaymentListResponse {
    private Order order;
    private PaymentMethod paymentMethod;
}
