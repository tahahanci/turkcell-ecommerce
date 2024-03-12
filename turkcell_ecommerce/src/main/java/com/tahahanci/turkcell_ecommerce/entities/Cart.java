package com.tahahanci.turkcell_ecommerce.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Table(name="carts")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cart {

    @Column(name="id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="user_id")
    private int userId;

    @OneToMany(mappedBy = "cart")
    private List<ProductCart> productCarts;

}
