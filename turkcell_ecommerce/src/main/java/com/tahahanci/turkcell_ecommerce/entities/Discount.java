package com.tahahanci.turkcell_ecommerce.entities;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "discounts")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
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
}
