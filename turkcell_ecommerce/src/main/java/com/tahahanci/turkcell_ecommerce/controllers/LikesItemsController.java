package com.tahahanci.turkcell_ecommerce.controllers;

import com.tahahanci.turkcell_ecommerce.services.abstracts.LikesItemsService;
import com.tahahanci.turkcell_ecommerce.services.abstracts.WishListItemsService;
import com.tahahanci.turkcell_ecommerce.services.dtos.likesitem.requests.LikesItemAddRequest;
import com.tahahanci.turkcell_ecommerce.services.dtos.likesitem.responses.LikesItemGetAllResponse;
import com.tahahanci.turkcell_ecommerce.services.dtos.wishlistitem.requests.WishListItemAddRequest;
import com.tahahanci.turkcell_ecommerce.services.dtos.wishlistitem.responses.WishListGetAllResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class LikesItemsController {

    private LikesItemsService likesItemsService;

    public LikesItemsController(LikesItemsService likesItemsService) {
        this.likesItemsService = likesItemsService;
    }

    @GetMapping("/getAll/{id}")
    public List<LikesItemGetAllResponse> getAll(@PathVariable int id){
        return likesItemsService.getAll(id);
    }

    @PostMapping("/add/{id}")
    public void add(@PathVariable int id, @RequestBody LikesItemAddRequest likesItemAddRequest){
        likesItemsService.add(id, likesItemAddRequest);
    }

}
