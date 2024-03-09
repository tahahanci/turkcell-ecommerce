package com.tahahanci.turkcell_ecommerce.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "addresses")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Address {

    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int addressID;
    @Column(name = "name")
    private String addressName;
    @Column(name = "description")
    private String addressDescription;
    @ManyToOne()
    @JoinColumn(name = "district_id")
    private District district;
    @Column(name = "receiver_name")
    private String receiverName;
    @Column(name = "receiver_surname")
    private String receiverSurname;
    @Column(name = "receiver_phone_number")
    private String receiverPhoneNumber;
}
