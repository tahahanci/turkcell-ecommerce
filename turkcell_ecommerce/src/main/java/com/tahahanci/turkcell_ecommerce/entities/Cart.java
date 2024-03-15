package com.tahahanci.turkcell_ecommerce.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import java.util.List;

@Table(name="carts")
@Entity
public class Cart {

    @Column(name="id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="user_id")
    private int userId;

    @OneToMany(mappedBy = "cart")
    private List<ProductCart> productCarts;

    public Cart() {
    }

    public Cart(int id ,int userId) {
        this.id = id;
        this.userId = userId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }






}
