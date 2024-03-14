package com.tahahanci.turkcell_ecommerce.controllers;

import com.tahahanci.turkcell_ecommerce.services.abstracts.WishListItemsService;
import com.tahahanci.turkcell_ecommerce.services.dtos.wishlistitem.requests.WishListItemAddRequest;
import com.tahahanci.turkcell_ecommerce.services.dtos.wishlistitem.responses.WishListGetAllResponse;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/wishList")
@RestController
public class WishListItemsController {

    private WishListItemsService wishListItemsService;

    public WishListItemsController(WishListItemsService wishListItemsService) {
        this.wishListItemsService = wishListItemsService;
    }

    @GetMapping("/getAll/{id}")
    public List<WishListGetAllResponse> getAll(@PathVariable int id){
        return wishListItemsService.getAll(id);
    }

    @PostMapping("/add/{id}")
    public void add(@PathVariable int id, @RequestBody WishListItemAddRequest wishListItemAddRequest){
        wishListItemsService.add(id, wishListItemAddRequest);
    }



}
