package com.tahahanci.turkcell_ecommerce.services.concretes;

import com.tahahanci.turkcell_ecommerce.entities.Address;
import com.tahahanci.turkcell_ecommerce.entities.User;
import com.tahahanci.turkcell_ecommerce.repositories.abstracts.AddressRepository;
import com.tahahanci.turkcell_ecommerce.repositories.abstracts.UserRepository;
import com.tahahanci.turkcell_ecommerce.services.dtos.address.requests.AddAddressRequest;
import com.tahahanci.turkcell_ecommerce.services.dtos.address.responses.AddressListResponse;

import com.tahahanci.turkcell_ecommerce.services.abstracts.AddressService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AddressServiceImpl implements AddressService {

    private AddressRepository addressRepository;
    private UserRepository userRepository;

    public AddressServiceImpl(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    @Override
    public List<AddressListResponse> getAll() {
        List<Address> addresses = addressRepository.findAll();
        List<AddressListResponse> addressListResponses = new ArrayList<>();

        for (Address address : addresses) {
            AddressListResponse addressListResponse = new AddressListResponse();
            addressListResponse.setAddressDescription(address.getAddressDescription());
            addressListResponse.setDistrictId(address.getDistrict().getDistrictID());
            addressListResponses.add(addressListResponse);
        }

        return addressListResponses;
    }

    @Override
    public Optional<Address> getByID(int id) {
        return addressRepository.findById(id);
    }

    @Override
    public void add(AddAddressRequest request) {
        Address address = new Address();
        address.setAddressDescription(request.getAddressDescription());
        address.getDistrict().setDistrictID(request.getDistrictId());

        //find user by id and set it to address
        User user = new User();
        userRepository.findById(request.getUserId());
        address.setReceiverName(user.getName());
        address.setReceiverSurname(user.getLastName());
        address.setReceiverPhoneNumber(user.getPhoneNumber());

        addressRepository.save(address);
    }

    @Override
    public void delete(int id) {
        addressRepository.deleteById(id);
    }
}
