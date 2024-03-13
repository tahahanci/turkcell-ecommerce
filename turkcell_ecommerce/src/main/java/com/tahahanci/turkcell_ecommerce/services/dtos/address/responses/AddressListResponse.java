package com.tahahanci.turkcell_ecommerce.services.dtos.address.responses;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AddressListResponse {

    private Integer id;

    private Integer districtId;

    private Integer userId;

    private String  addressDescription;
}
