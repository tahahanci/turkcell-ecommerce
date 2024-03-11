package com.tahahanci.turkcell_ecommerce.repositories.abstracts;

import com.tahahanci.turkcell_ecommerce.entities.User;
import com.tahahanci.turkcell_ecommerce.services.dtos.user.requests.UpdatePhoneNumberRequest;
import com.tahahanci.turkcell_ecommerce.services.dtos.user.responses.UserListResponse;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface UserRepository extends JpaRepository<User,Integer> {

    @Query("SELECT u FROM User u WHERE u.name LIKE :letter%")
    List<User> searchByLetter(String letter);

    @Query("SELECT COUNT(u) FROM User u")
    int getUserCount();

    // UPDATE users SET phone_number = '5351234567' WHERE id = 2;
    @Modifying
    @Query("UPDATE User u SET u.phoneNumber = :phoneNumber WHERE u.id = :id")
    @Transactional
    void updatePhoneNumber(@Param("id") int id, @Param("phoneNumber") String phoneNumber);
}
