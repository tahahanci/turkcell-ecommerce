package com.tahahanci.turkcell_ecommerce.repositories.abstracts;

import com.tahahanci.turkcell_ecommerce.entities.Order;
import com.tahahanci.turkcell_ecommerce.services.dtos.orders.response.OrderCountForUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order,Integer> {

    @Query(value= "SELECT new com.tahahanci.turkcell_ecommerce.services.dtos.orders.response.OrderCountForUser(o.user.id, COUNT(o)) "
            + "FROM Order AS o GROUP BY o.user.id")
    public List<OrderCountForUser> getOrderCountByUser();
}
