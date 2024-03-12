package com.tahahanci.turkcell_ecommerce.repositories.abstracts;

import com.tahahanci.turkcell_ecommerce.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface CountryRepository extends JpaRepository<Country, Integer> {

    @Query(value = "select c.countryName from Country c where lower(c.countryName) like %:query%")
    List<Country> search(String query);

    Optional<Country> findByCountryName(String query);
}
