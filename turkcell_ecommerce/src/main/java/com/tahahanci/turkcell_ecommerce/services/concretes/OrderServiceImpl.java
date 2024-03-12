package com.tahahanci.turkcell_ecommerce.services.concretes;

import com.tahahanci.turkcell_ecommerce.repositories.abstracts.OrderRepository;
import com.tahahanci.turkcell_ecommerce.services.abstracts.OrderService;
import com.tahahanci.turkcell_ecommerce.services.dtos.orders.response.OrderCountForUser;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class OrderServiceImpl implements OrderService {
    private OrderRepository orderRepository;
    @Override
    public List<OrderCountForUser> getOrderCountByUser() {
        return orderRepository.getOrderCountByUser();
    }
}
