package com.tahahanci.turkcell_ecommerce.services.dtos.paymentmethod.responses;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PaymentMethodListResponse {
    private int id;
    private String name;
}
