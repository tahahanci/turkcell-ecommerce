package com.tahahanci.turkcell_ecommerce.services.abstracts;

import com.tahahanci.turkcell_ecommerce.services.dtos.likesitem.requests.LikesItemAddRequest;
import com.tahahanci.turkcell_ecommerce.services.dtos.likesitem.responses.LikesItemGetAllResponse;

import java.util.List;

public interface LikesItemsService {
    List<LikesItemGetAllResponse> getAll(int id);

    void add(int id, LikesItemAddRequest likesItemAddRequest);
}
