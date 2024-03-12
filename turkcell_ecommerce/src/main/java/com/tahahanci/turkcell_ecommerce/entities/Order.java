package com.tahahanci.turkcell_ecommerce.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Table(name="orders")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Order {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="date")
    private LocalDateTime date;

    @Column(name="status")
    private String status;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;

    @Column(name="amount")
    private double amount;

    @ManyToOne
    @JoinColumn(name="address_id")
    private Address adress;

    @OneToOne(mappedBy = "order")
    private Payment payment;

    @ManyToMany(mappedBy = "orders")
    private List<Product> products;

}
