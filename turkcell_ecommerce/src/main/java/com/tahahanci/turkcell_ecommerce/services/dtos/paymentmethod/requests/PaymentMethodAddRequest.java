package com.tahahanci.turkcell_ecommerce.services.dtos.paymentmethod.requests;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class PaymentMethodAddRequest {

    @NotNull
    private String name;

    public PaymentMethodAddRequest() {
    }

    public PaymentMethodAddRequest(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
