package com.tahahanci.turkcell_ecommerce.controllers;

import com.tahahanci.turkcell_ecommerce.services.abstracts.DistrictService;
import com.tahahanci.turkcell_ecommerce.services.dtos.district.requests.DistrictAddRequest;
import com.tahahanci.turkcell_ecommerce.services.dtos.district.responses.DistrictListResponse;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/districts")
public class DistrictController {

    private final DistrictService districtService;

    public DistrictController(DistrictService districtService) {
        this.districtService = districtService;
    }

    @GetMapping
    public List<DistrictListResponse> getAll() {
        return districtService.getAll();
    }

    @PostMapping
    void createDistrict(@RequestBody @Valid DistrictAddRequest districtAddRequest) {
        districtService.add(districtAddRequest);
    }

}