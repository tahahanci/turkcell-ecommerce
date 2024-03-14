package com.tahahanci.turkcell_ecommerce.services.abstracts;

import com.tahahanci.turkcell_ecommerce.services.dtos.wishlistitem.requests.WishListItemAddRequest;
import com.tahahanci.turkcell_ecommerce.services.dtos.wishlistitem.responses.WishListGetAllResponse;

import java.util.List;

public interface WishListItemsService {
    public List<WishListGetAllResponse> getAll(int id);

    public void add(int id, WishListItemAddRequest wishListItemAddRequest);
}
