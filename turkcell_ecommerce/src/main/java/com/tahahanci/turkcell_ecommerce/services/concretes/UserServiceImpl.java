package com.tahahanci.turkcell_ecommerce.services.concretes;

import com.tahahanci.turkcell_ecommerce.core.exception.types.BusinessException;
import com.tahahanci.turkcell_ecommerce.core.services.abstracts.MessageService;
import com.tahahanci.turkcell_ecommerce.entities.Cart;
import com.tahahanci.turkcell_ecommerce.entities.User;
import com.tahahanci.turkcell_ecommerce.repositories.abstracts.UserRepository;
import com.tahahanci.turkcell_ecommerce.services.abstracts.CartService;
import com.tahahanci.turkcell_ecommerce.services.abstracts.UserService;
import com.tahahanci.turkcell_ecommerce.services.constants.Messages;
import com.tahahanci.turkcell_ecommerce.services.dtos.cart.requests.CartAddRequest;
import com.tahahanci.turkcell_ecommerce.services.dtos.user.requests.AddUserRequest;
import com.tahahanci.turkcell_ecommerce.services.dtos.user.requests.UpdatePhoneNumberRequest;
import com.tahahanci.turkcell_ecommerce.services.dtos.user.responses.UserListResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final CartService cartService;
    private final MessageService messageService;

    public UserServiceImpl(UserRepository userRepository, CartService cartService, MessageService messageService) {
        this.userRepository = userRepository;
        this.cartService = cartService;
        this.messageService = messageService;
    }


    //TODO -> bir user oluşturulduğunda usera direkt bir Cart atanacak
    @Override
    public void add(AddUserRequest user) {
        User newUser = new User();
        //check if there is a user with this name, lastname and phonenumber
        System.out.println("HERE 1");
        if(userRepository.existsByNameAndLastNameAndPhoneNumber(user.getName(), user.getLastName(), user.getPhoneNumber()) != null){
            System.out.println("User already exists");
            throw new BusinessException(messageService.getMessageWithArgs(Messages.BusinessErrors.USER_ALREADY_EXIST, user.getName(), user.getLastName(), user.getPhoneNumber()));
        }

        System.out.println("HERE 2");

        newUser.setName(user.getName());
        newUser.setLastName(user.getLastName());
        newUser.setPhoneNumber(user.getPhoneNumber());

        User s = userRepository.save(newUser);

        Cart cart = new Cart();
        cart.setUserId(s.getId());

        CartAddRequest cartAddRequest = new CartAddRequest();
        cartAddRequest.setUserId(s.getId());
        cartService.add(cartAddRequest);
    }

    @Override
    public List<UserListResponse> getAll() {
        List<User> users = userRepository.findAll();

        List<UserListResponse> userResponses = users.stream().map(user -> new UserListResponse(user.getName(), user.getLastName())).collect(Collectors.toList());

        return userResponses;
    }

    @Override
    public List<UserListResponse> searchByLetter(String letter) {
        List<User> users = userRepository.searchByLetter(letter);
        List<UserListResponse> userResponses = users.stream().map(user -> new UserListResponse(user.getName(), user.getLastName())).collect(Collectors.toList());

        return userResponses;
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
