package com.tahahanci.turkcell_ecommerce.entities;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "discounts")
@Entity
public class Discount {

    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int discountID;
    @ManyToOne
    @JoinColumn(name = "productsuppliers_id")
    private ProductSupplier productSupplier;
    @Column(name = "rate")
    private double discountRate;

    public Discount() {
    }

    public Discount(int discountID, ProductSupplier productSupplier, double discountRate) {
        this.discountID = discountID;
        this.productSupplier = productSupplier;
        this.discountRate = discountRate;
    }

    public int getDiscountID() {
        return discountID;
    }

    public void setDiscountID(int discountID) {
        this.discountID = discountID;
    }

    public ProductSupplier getProductSupplier() {
        return productSupplier;
    }

    public void setProductSupplier(ProductSupplier productSupplier) {
        this.productSupplier = productSupplier;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }
}
