package com.tahahanci.turkcell_ecommerce.controllers;

import com.tahahanci.turkcell_ecommerce.services.abstracts.CityService;
import com.tahahanci.turkcell_ecommerce.services.dtos.city.request.AddCityRequest;
import com.tahahanci.turkcell_ecommerce.services.dtos.city.response.CityListResponse;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cities")
public class CitiesController {

    private final CityService cityService;

    public CitiesController(CityService cityService) {
        this.cityService = cityService;
    }

    @GetMapping
    public List<CityListResponse> getAll() {
        return cityService.getAll();
    }

    @PostMapping
    public void add(@RequestBody AddCityRequest addCityRequest) {
        cityService.add(addCityRequest);
    }

    @GetMapping("search")
    public List<CityListResponse> search(@RequestParam String query) {
        return cityService.searchDto(query);
    }

}
