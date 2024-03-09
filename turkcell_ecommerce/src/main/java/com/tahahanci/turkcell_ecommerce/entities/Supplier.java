package com.tahahanci.turkcell_ecommerce.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "suppliers")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Supplier {

    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int supplierID;
    @Column(name = "name")
    private String supplierName;
    @Column(name = "phone_number")
    private String supplierPhoneNumber;
    @Column(name = "mail")
    private String supplierMail;
    @Column(name = "password")
    private String supplierPassword;

    @OneToMany(mappedBy = "supplier")
    @JsonIgnore
    private List<ProductSupplier> productSuppliers;
}