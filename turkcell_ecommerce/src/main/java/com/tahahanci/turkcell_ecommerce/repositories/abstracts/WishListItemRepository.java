package com.tahahanci.turkcell_ecommerce.repositories.abstracts;

import com.tahahanci.turkcell_ecommerce.entities.WishListItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface WishListItemRepository extends JpaRepository<WishListItem,Integer>{
    @Query("select w from WishListItem w where w.user.id = ?1")
    List<WishListItem> findAllByUserId(int id);
}
