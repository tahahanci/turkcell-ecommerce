package com.tahahanci.turkcell_ecommerce.repositories.abstracts;

import com.tahahanci.turkcell_ecommerce.entities.City;
import com.tahahanci.turkcell_ecommerce.services.dtos.city.response.CityListResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface CityRepository extends JpaRepository<City, Integer> {

    Optional<City> findByName(String query);

    @Query(value = "SELECT new com.tahahanci.turkcell_ecommerce.services.dtos.city.response.CityListResponse(c.name, a.countryName) " +
            "from City c JOIN c.country a where lower(c.name) like %:query% ")
    List<CityListResponse> searchDto(String query);
}
