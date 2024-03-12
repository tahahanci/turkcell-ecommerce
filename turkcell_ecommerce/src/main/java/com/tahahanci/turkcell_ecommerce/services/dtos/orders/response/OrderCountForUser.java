package com.tahahanci.turkcell_ecommerce.services.dtos.orders.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderCountForUser {
    private int userId;
    private long count;
}
