package com.tahahanci.turkcell_ecommerce.services.dtos.payment.requests;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PaymentAddRequest {

    @Min(1)
    @NotNull
    private int orderId;

    @Min(1)
    @NotNull
    private int paymentMethodId;


}
