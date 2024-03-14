package com.tahahanci.turkcell_ecommerce.services.abstracts;

import com.tahahanci.turkcell_ecommerce.services.dtos.district.requests.DistrictAddRequest;
import com.tahahanci.turkcell_ecommerce.services.dtos.district.responses.DistrictListResponse;

import java.util.List;

public interface DistrictService {
    List<DistrictListResponse> getAll();

    void add(DistrictAddRequest districtAddRequest);


    void deleteById(int id);
}
