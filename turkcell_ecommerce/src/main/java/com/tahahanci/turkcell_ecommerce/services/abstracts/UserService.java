package com.tahahanci.turkcell_ecommerce.services.abstracts;

import com.tahahanci.turkcell_ecommerce.entities.User;

import java.util.List;

public interface UserService {

    void add(User user);
    List<User> getAll();
}
