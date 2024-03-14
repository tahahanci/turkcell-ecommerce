package com.tahahanci.turkcell_ecommerce.repositories.abstracts;

import com.tahahanci.turkcell_ecommerce.entities.LikesItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface LikesItemRepository extends JpaRepository<LikesItem, Integer> {

    @Query("select l from LikesItem l where l.user.id = ?1")
    List<LikesItem> findAllByUserId(int id);
}
