package com.tahahanci.turkcell_ecommerce.services.concretes;

import com.tahahanci.turkcell_ecommerce.entities.Product;
import com.tahahanci.turkcell_ecommerce.entities.User;
import com.tahahanci.turkcell_ecommerce.entities.WishListItem;
import com.tahahanci.turkcell_ecommerce.repositories.abstracts.ProductRepository;
import com.tahahanci.turkcell_ecommerce.repositories.abstracts.UserRepository;
import com.tahahanci.turkcell_ecommerce.repositories.abstracts.WishListItemRepository;
import com.tahahanci.turkcell_ecommerce.services.abstracts.WishListItemsService;
import com.tahahanci.turkcell_ecommerce.services.dtos.wishlistitem.requests.WishListItemAddRequest;
import com.tahahanci.turkcell_ecommerce.services.dtos.wishlistitem.responses.WishListGetAllResponse;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class WishListItemsServiceImpl implements WishListItemsService {

    private final WishListItemRepository wishListItemRepository;
    private final UserRepository userRepository;
    private final ProductRepository productRepository;

    public WishListItemsServiceImpl(WishListItemRepository wishListItemRepository, UserRepository userRepository, ProductRepository productRepository) {
        this.wishListItemRepository = wishListItemRepository;
        this.userRepository = userRepository;
        this.productRepository = productRepository;
    }


    @Override
    public List<WishListGetAllResponse> getAll(int id) {
        List<WishListGetAllResponse> wishListGetAllResponses = new ArrayList<>();

        //find all wish list items by user id
        List<WishListItem> wishListItems = wishListItemRepository.findAllByUserId(id);

        //for each wish list item, create a response object and add it to the list

        for (WishListItem wishListItem : wishListItems) {
            WishListGetAllResponse wishListGetAllResponse = new WishListGetAllResponse();
            wishListGetAllResponse.setUser(wishListItem.getUser());
            wishListGetAllResponse.setProduct(wishListItem.getProduct());
            wishListGetAllResponses.add(wishListGetAllResponse);
        }
        return wishListGetAllResponses;
    }

    @Override
    public void add(int id, WishListItemAddRequest wishListItemAddRequest) {
        //create a new wish list item
        WishListItem wishListItem = new WishListItem();

        User user = userRepository.findById(id).get();
        wishListItem.setUser(user);

        Product product = productRepository.findById(wishListItemAddRequest.getProductId()).get();
        wishListItem.setProduct(product);

        wishListItem.setUser(user);
        wishListItem.setProduct(product);

        wishListItemRepository.save(wishListItem);
    }
}
