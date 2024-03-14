package com.tahahanci.turkcell_ecommerce.services.dtos.discount.responses;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class DiscountListResponse {

    private String supplierName;

    private String productName;

    private double discountRate;

}
