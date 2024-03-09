package com.tahahanci.turkcell_ecommerce.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "districts")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class District {

    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private  int districtID;


    @Column(name="name")
    private String districtName;


    @ManyToOne()
    @JoinColumn(name="cityid")
    private City city;

    @OneToMany(mappedBy = "district")
    @JsonIgnore
    private List<Address> addres;
}
