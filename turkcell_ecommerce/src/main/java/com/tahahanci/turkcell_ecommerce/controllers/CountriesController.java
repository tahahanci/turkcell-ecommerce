package com.tahahanci.turkcell_ecommerce.controllers;

import com.tahahanci.turkcell_ecommerce.services.abstracts.CountryService;
import com.tahahanci.turkcell_ecommerce.services.dtos.country.request.AddCountryRequest;
import com.tahahanci.turkcell_ecommerce.services.dtos.country.request.DeleteCountryRequest;
import com.tahahanci.turkcell_ecommerce.services.dtos.country.response.CountryListResponse;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/countries")
public class CountriesController {

    private final CountryService countryService;

    public CountriesController(CountryService countryService) {
        this.countryService = countryService;
    }

    @PostMapping
    public void add(@RequestBody @Valid AddCountryRequest addCountryRequest) {
        countryService.add(addCountryRequest);
    }

    @GetMapping
    public List<CountryListResponse> getAll() {
        return countryService.getAll();
    }

    @GetMapping("search")
    public List<CountryListResponse> search(@RequestParam String query) {
        return countryService.search(query);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestBody DeleteCountryRequest deleteCountryRequest) {
        countryService.delete(deleteCountryRequest);
    }
}
