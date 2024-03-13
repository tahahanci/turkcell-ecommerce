package com.tahahanci.turkcell_ecommerce.controllers;

import com.tahahanci.turkcell_ecommerce.entities.User;
import com.tahahanci.turkcell_ecommerce.services.abstracts.UserService;
import com.tahahanci.turkcell_ecommerce.services.dtos.user.requests.AddUserRequest;
import com.tahahanci.turkcell_ecommerce.services.dtos.user.requests.UpdatePhoneNumberRequest;
import com.tahahanci.turkcell_ecommerce.services.dtos.user.responses.UserListResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/users")
@AllArgsConstructor
public class UserController {

    UserService userService;
    @PostMapping
    public void add(AddUserRequest user) {
        userService.add(user);
    }

    @GetMapping
    public List<UserListResponse> getAll() {
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

    //update phone number of user by id
    @PutMapping("/updatePhoneNumber/{id}")
    public void updatePhoneNumber(@PathVariable int id, @RequestBody UpdatePhoneNumberRequest phoneNumberRequest) {
        userService.updatePhoneNumber(id, phoneNumberRequest);
    }

}
