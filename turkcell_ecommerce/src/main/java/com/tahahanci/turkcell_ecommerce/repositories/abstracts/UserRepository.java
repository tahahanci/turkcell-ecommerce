package com.tahahanci.turkcell_ecommerce.repositories.abstracts;

import com.tahahanci.turkcell_ecommerce.entities.User;
import com.tahahanci.turkcell_ecommerce.services.dtos.user.responses.UserListResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface UserRepository extends JpaRepository<User,Integer> {

    @Query("SELECT u FROM User u WHERE u.name LIKE :letter%")
    List<User> searchByLetter(String letter);
}
