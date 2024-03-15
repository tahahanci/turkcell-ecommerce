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

    public Country() {
    }

    public Country(int countryID, String countryName, List<City> cities) {
        this.countryID = countryID;
        this.countryName = countryName;
        this.cities = cities;
    }

    public int getCountryID() {
        return countryID;
    }

    public void setCountryID(int countryID) {
        this.countryID = countryID;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }
}
