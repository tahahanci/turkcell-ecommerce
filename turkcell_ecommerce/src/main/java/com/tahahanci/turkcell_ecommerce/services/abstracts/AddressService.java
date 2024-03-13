package com.tahahanci.turkcell_ecommerce.services.abstracts;

import com.tahahanci.turkcell_ecommerce.entities.Address;
import com.tahahanci.turkcell_ecommerce.services.dtos.address.requests.AddAddressRequest;
import com.tahahanci.turkcell_ecommerce.services.dtos.address.responses.AddressListResponse;

import java.util.List;
import java.util.Optional;

public interface AddressService {

    List<AddressListResponse> getAll();

    Optional<Address> getByID(int id);

    void add(AddAddressRequest request);


    void delete(int id);
}
