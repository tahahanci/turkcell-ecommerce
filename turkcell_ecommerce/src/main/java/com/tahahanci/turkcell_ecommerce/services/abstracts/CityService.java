package com.tahahanci.turkcell_ecommerce.services.abstracts;

import com.tahahanci.turkcell_ecommerce.services.dtos.city.request.AddCityRequest;
import com.tahahanci.turkcell_ecommerce.services.dtos.city.request.DeleteCityRequest;
import com.tahahanci.turkcell_ecommerce.services.dtos.city.response.CityListResponse;

import java.util.List;

public interface CityService {

    List<CityListResponse> getAll();

    void add(AddCityRequest addCityRequest);

    List<CityListResponse> searchDto(String query);

    void delete(DeleteCityRequest deleteCityRequest);
}
