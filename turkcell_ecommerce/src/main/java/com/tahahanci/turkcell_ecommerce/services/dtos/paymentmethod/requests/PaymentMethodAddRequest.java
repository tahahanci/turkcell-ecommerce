package com.tahahanci.turkcell_ecommerce.services.dtos.paymentmethod.requests;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PaymentMethodAddRequest {

    @NotNull
    private String name;
}
