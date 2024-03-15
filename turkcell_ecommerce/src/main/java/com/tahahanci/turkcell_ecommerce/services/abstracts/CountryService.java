package com.tahahanci.turkcell_ecommerce.services.abstracts;

import com.tahahanci.turkcell_ecommerce.services.dtos.country.request.AddCountryRequest;
import com.tahahanci.turkcell_ecommerce.services.dtos.country.request.DeleteCountryRequest;
import com.tahahanci.turkcell_ecommerce.services.dtos.country.response.CountryListResponse;

import java.util.List;
import java.util.Optional;

public interface CountryService {

    void add(AddCountryRequest addCountryRequest);

    void delete(DeleteCountryRequest deleteCountryRequest);

    List<CountryListResponse> getAll();

    List<CountryListResponse> search(String query);
}
