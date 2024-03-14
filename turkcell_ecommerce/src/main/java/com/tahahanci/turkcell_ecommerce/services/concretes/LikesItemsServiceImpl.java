package com.tahahanci.turkcell_ecommerce.services.concretes;

import com.tahahanci.turkcell_ecommerce.entities.LikesItem;
import com.tahahanci.turkcell_ecommerce.repositories.abstracts.LikesItemRepository;
import com.tahahanci.turkcell_ecommerce.repositories.abstracts.ProductRepository;
import com.tahahanci.turkcell_ecommerce.repositories.abstracts.UserRepository;
import com.tahahanci.turkcell_ecommerce.services.abstracts.LikesItemsService;
import com.tahahanci.turkcell_ecommerce.services.dtos.likesitem.requests.LikesItemAddRequest;
import com.tahahanci.turkcell_ecommerce.services.dtos.likesitem.responses.LikesItemGetAllResponse;

import java.util.ArrayList;
import java.util.List;

public class LikesItemsServiceImpl implements LikesItemsService {
    private final LikesItemRepository likesItemRepository;
    private final UserRepository userRepository;
    private final ProductRepository productRepository;

    public LikesItemsServiceImpl(LikesItemRepository likesItemRepository, UserRepository userRepository, ProductRepository productRepository) {
        this.likesItemRepository = likesItemRepository;
        this.userRepository = userRepository;
        this.productRepository = productRepository;
    }

    @Override
    public List<LikesItemGetAllResponse> getAll(int id) {
        List<LikesItemGetAllResponse> likesItemGetAllResponses = new ArrayList<>();
        List<LikesItem> likesItems = likesItemRepository.findAllByUserId(id);

        for (LikesItem likesItem : likesItems) {
            LikesItemGetAllResponse likesItemGetAllResponse = new LikesItemGetAllResponse();
            likesItemGetAllResponse.setUser(likesItem.getUser());
            likesItemGetAllResponse.setProduct(likesItem.getProduct());
            likesItemGetAllResponses.add(likesItemGetAllResponse);
        }

        return likesItemGetAllResponses;
    }

    @Override
    public void add(int id, LikesItemAddRequest likesItemAddRequest) {
        LikesItem likesItem = new LikesItem();
        likesItem.setUser(userRepository.findById(id).get());
        likesItem.setProduct(productRepository.findById(likesItemAddRequest.getProductId()).get());
        likesItemRepository.save(likesItem);
    }
}
