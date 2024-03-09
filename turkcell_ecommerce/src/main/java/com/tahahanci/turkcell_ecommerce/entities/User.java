package com.tahahanci.turkcell_ecommerce.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Table(name="users")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="name")
    private String name;

    @Column(name="surname")
    private String lastName;

    @Column(name="email")
    private String email;

    @Column(name="phone_number")
    private String phoneNumber;

    @Column(name="password")
    private String password;

    @JsonIgnore
    @OneToMany(mappedBy = "user")
    private List<LikesItem> likesItems;

    @JsonIgnore
    @OneToMany(mappedBy = "user")
    private List<WishListItem> wishListItems;

    @JsonIgnore
    @OneToMany(mappedBy = "user")
    private List<Order> orders;



}
