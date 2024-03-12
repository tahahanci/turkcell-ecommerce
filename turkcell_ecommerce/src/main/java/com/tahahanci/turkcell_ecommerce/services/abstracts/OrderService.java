package com.tahahanci.turkcell_ecommerce.services.abstracts;

import com.tahahanci.turkcell_ecommerce.services.dtos.orders.response.OrderCountForUser;

import java.util.List;

public interface OrderService {
    List<OrderCountForUser> getOrderCountByUser();
}
