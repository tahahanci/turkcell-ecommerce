package com.tahahanci.turkcell_ecommerce.services.concretes;

import com.tahahanci.turkcell_ecommerce.entities.User;
import com.tahahanci.turkcell_ecommerce.repositories.abstracts.UserRepository;
import com.tahahanci.turkcell_ecommerce.services.abstracts.UserService;
import com.tahahanci.turkcell_ecommerce.services.dtos.user.requests.UpdatePhoneNumberRequest;
import com.tahahanci.turkcell_ecommerce.services.dtos.user.responses.UserListResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;
    @Override
    public void add(User user) {
        userRepository.save(user);
    }

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public List<UserListResponse> searchByLetter(String letter) {
        List<User> users = userRepository.searchByLetter(letter);

        return users.stream().map(user -> new UserListResponse(user.getId(), user.getName(), user.getLastName())).collect(Collectors.toList());
    }

    @Override
    public int findUserCount() {
        return userRepository.getUserCount();
    }

    @Override
    public void updatePhoneNumber(int id, UpdatePhoneNumberRequest phoneNumber) {
        userRepository.updatePhoneNumber(id, phoneNumber.getPhoneNumber());
    }


}
