package com.tahahanci.turkcell_ecommerce.controllers;


import com.tahahanci.turkcell_ecommerce.entities.Address;
import com.tahahanci.turkcell_ecommerce.services.abstracts.AddressService;
import com.tahahanci.turkcell_ecommerce.services.dtos.address.requests.AddAddressRequest;
import com.tahahanci.turkcell_ecommerce.services.dtos.address.responses.AddressListResponse;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/address")
public class AddressController {

    private AddressService addressService;

    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    @GetMapping
    public List<AddressListResponse> get() {
        return addressService.getAll();
    }


    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        addressService.delete(id);
    }

    @GetMapping("/{id}")
    public Optional<Address> getByID(@PathVariable int id) {
        return addressService.getByID(id);
    }

    @PostMapping
    public void add(@RequestBody @Valid AddAddressRequest request) {
        addressService.add(request);
    }



}