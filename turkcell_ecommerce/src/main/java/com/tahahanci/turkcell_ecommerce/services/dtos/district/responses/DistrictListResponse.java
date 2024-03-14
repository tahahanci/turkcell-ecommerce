package com.tahahanci.turkcell_ecommerce.services.dtos.district.responses;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DistrictListResponse {
    private int id;
    private String cityName;
    private String districtName;
}