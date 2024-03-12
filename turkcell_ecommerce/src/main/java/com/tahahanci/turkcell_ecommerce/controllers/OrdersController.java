package com.tahahanci.turkcell_ecommerce.controllers;

import com.tahahanci.turkcell_ecommerce.services.abstracts.OrderService;
import com.tahahanci.turkcell_ecommerce.services.dtos.orders.response.OrderCountForUser;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/orders")
@AllArgsConstructor
public class OrdersController {

    private OrderService orderService;

    @GetMapping("/orderCountsByUser")
    List<OrderCountForUser> getOrderCountByUser(){
       return orderService.getOrderCountByUser();
    }
}
