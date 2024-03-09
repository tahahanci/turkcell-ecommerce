package com.tahahanci.turkcell_ecommerce.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Table(name = "countries")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Country {

    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int countryID;
    @Column(name = "name")
    private String countryName;

    @OneToMany(mappedBy = "country")
    @JsonIgnore // TODO: remove after dto
    private List<City> cities;
}
