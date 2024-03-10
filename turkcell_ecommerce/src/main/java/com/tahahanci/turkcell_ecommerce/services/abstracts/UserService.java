package com.tahahanci.turkcell_ecommerce.services.abstracts;

import com.tahahanci.turkcell_ecommerce.entities.User;
import com.tahahanci.turkcell_ecommerce.services.dtos.user.responses.UserListResponse;
import java.util.List;

public interface UserService {

    void add(User user);
    List<User> getAll();

    List<UserListResponse> searchByLetter(String letter);
}
