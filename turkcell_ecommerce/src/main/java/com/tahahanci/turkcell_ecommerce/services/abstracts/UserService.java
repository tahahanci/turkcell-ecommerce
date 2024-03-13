package com.tahahanci.turkcell_ecommerce.services.abstracts;

import com.tahahanci.turkcell_ecommerce.entities.User;
import com.tahahanci.turkcell_ecommerce.services.dtos.user.requests.AddUserRequest;
import com.tahahanci.turkcell_ecommerce.services.dtos.user.requests.UpdatePhoneNumberRequest;
import com.tahahanci.turkcell_ecommerce.services.dtos.user.responses.UserListResponse;
import java.util.List;

public interface UserService {

    void add(AddUserRequest user);
    List<UserListResponse> getAll();

    List<UserListResponse> searchByLetter(String letter);

    int findUserCount();


    void updatePhoneNumber(int id, UpdatePhoneNumberRequest phoneNumberRequest);
}
