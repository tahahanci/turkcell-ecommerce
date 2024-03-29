package com.tahahanci.turkcell_ecommerce.services.concretes;

import com.tahahanci.turkcell_ecommerce.core.exception.types.BusinessException;
import com.tahahanci.turkcell_ecommerce.entities.City;
import com.tahahanci.turkcell_ecommerce.entities.Country;
import com.tahahanci.turkcell_ecommerce.repositories.abstracts.CityRepository;
import com.tahahanci.turkcell_ecommerce.services.abstracts.CityService;
import com.tahahanci.turkcell_ecommerce.services.dtos.city.request.AddCityRequest;
import com.tahahanci.turkcell_ecommerce.services.dtos.city.request.DeleteCityRequest;
import com.tahahanci.turkcell_ecommerce.services.dtos.city.response.CityListResponse;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CityServiceImpl implements CityService {

    private final CityRepository cityRepository;

    public CityServiceImpl(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    @Override
    public List<CityListResponse> getAll() {
        List<City> cityList = cityRepository.findAll();
        List<CityListResponse> cityListResponses = new ArrayList<>();
        for (City city : cityList) {
            CityListResponse cityListResponse = new CityListResponse();
            cityListResponse.setCityName(city.getName());
            cityListResponse.setCountryName(city.getCountry().getCountryName());
            cityListResponses.add(cityListResponse);
        }
        return cityListResponses;
    }

    @Override
    public void add(AddCityRequest addCityRequest) {
        cityWithSameNameShouldNotExist(addCityRequest.getCityName());
        City city = new City();
        city.setName(addCityRequest.getCityName());
        Country country = new Country();
        country.setCountryID(addCityRequest.getCountryID());
        city.setCountry(country);
        cityRepository.save(city);
    }

    @Override
    public List<CityListResponse> searchDto(String query) {
        return cityRepository.searchDto(query);
    }

    @Override
    public void delete(DeleteCityRequest deleteCityRequest) {
        isCityExist(deleteCityRequest.getCityName());
        List<City> cityList = cityRepository.findAll();
        for (City city : cityList) {
            if (city.getName().equals(deleteCityRequest.getCityName())) {
                cityRepository.delete(city);
            }
        }
    }

    private void cityWithSameNameShouldNotExist(String name) {
        Optional<City> cityWithSameName = cityRepository.findByName(name);
        if (cityWithSameName.isPresent())
            throw new BusinessException("You cannot add same country with same name!");
    }

    private void isCityExist(String name) {
        Optional<City> cityExistChecker = cityRepository.findByName(name);
        if (cityExistChecker.isEmpty())
            throw new BusinessException("City is not exist!");
    }

}
