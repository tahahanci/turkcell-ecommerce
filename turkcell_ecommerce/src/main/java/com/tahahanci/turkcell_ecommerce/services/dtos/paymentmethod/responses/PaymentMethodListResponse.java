package com.tahahanci.turkcell_ecommerce.services.dtos.paymentmethod.responses;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class PaymentMethodListResponse {
    private int id;
    private String name;

    public PaymentMethodListResponse() {
    }

    public PaymentMethodListResponse(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
