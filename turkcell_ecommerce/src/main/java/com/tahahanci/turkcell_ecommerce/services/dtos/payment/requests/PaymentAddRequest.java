package com.tahahanci.turkcell_ecommerce.services.dtos.payment.requests;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
public class PaymentAddRequest {

    @Min(1)
    @NotNull
    private int orderId;

    @Min(1)
    @NotNull
    private int paymentMethodId;

    public PaymentAddRequest() {
    }

    public PaymentAddRequest(int orderId, int paymentMethodId) {
        this.orderId = orderId;
        this.paymentMethodId = paymentMethodId;
    }

    public int getOrderId() {
        return orderId;
    }


    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getPaymentMethodId() {
        return paymentMethodId;
    }

    public void setPaymentMethodId(int paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
    }



}
