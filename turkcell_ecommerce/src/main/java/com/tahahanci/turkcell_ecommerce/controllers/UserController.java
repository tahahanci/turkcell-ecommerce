package com.tahahanci.turkcell_ecommerce.controllers;

import com.tahahanci.turkcell_ecommerce.entities.User;
import com.tahahanci.turkcell_ecommerce.services.abstracts.UserService;
import com.tahahanci.turkcell_ecommerce.services.dtos.user.responses.UserListResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/users")
@AllArgsConstructor
public class UserController {

    UserService userService;
    @PostMapping
    public void add(User user) {
        userService.add(user);
    }

    @GetMapping
    public List<User> getAll() {
        return userService.getAll();
    }

    // get users that started with a specific letter
    @GetMapping("/searchByLetter")
    public List<UserListResponse> getByLetter(String letter) {
        return userService.searchByLetter(letter);
    }

    // get user count
    @GetMapping("/count")
    public int getUserCount() {
        return userService.findUserCount();
    }
}
