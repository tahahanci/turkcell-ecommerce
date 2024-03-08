package com.tahahanci.turkcell_ecommerce.entities;

import jakarta.persistence.*;
import lombok.Data;

@Table(name="products")
@Entity
@Data
public class Product
{
    @Column(name="id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="name")
    private String name;

    @Column(name="description")
    private String description;

    @Column(name="price")
    private double price;

    @Column(name="stock")
    private long stock_quantity;

    @ManyToOne()
    @JoinColumn(name="category_id")
    private Category category;

    @ManyToOne()
    @JoinColumn(name="brand_id")
    private Brand brand;
}


