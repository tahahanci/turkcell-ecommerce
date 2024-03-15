package com.tahahanci.turkcell_ecommerce.services.concretes;

import com.tahahanci.turkcell_ecommerce.core.exception.types.BusinessException;
import com.tahahanci.turkcell_ecommerce.entities.Category;
import com.tahahanci.turkcell_ecommerce.entities.Country;
import com.tahahanci.turkcell_ecommerce.repositories.abstracts.CountryRepository;
import com.tahahanci.turkcell_ecommerce.services.abstracts.CountryService;
import com.tahahanci.turkcell_ecommerce.services.dtos.country.request.AddCountryRequest;
import com.tahahanci.turkcell_ecommerce.services.dtos.country.request.DeleteCountryRequest;
import com.tahahanci.turkcell_ecommerce.services.dtos.country.response.CountryListResponse;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CountryServiceImpl implements CountryService {

    private final CountryRepository countryRepository;

    public CountryServiceImpl(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    @Override
    public void add(AddCountryRequest addCountryRequest) {
        countryWithSameNameShouldNotExist(addCountryRequest.getCountryName());
        Country country = new Country();
        country.setCountryName(addCountryRequest.getCountryName());
        countryRepository.save(country);
    }

    @Override
    public void delete(DeleteCountryRequest deleteCountryRequest) {
        isCountryExist(deleteCountryRequest.getCountryName());
        List<Country> countries = countryRepository.findAll();
        for (Country country : countries) {
            if (country.getCountryName().equals(deleteCountryRequest.getCountryName())) {
                countryRepository.delete(country);
            }
        }
    }

    @Override
    public List<CountryListResponse> getAll() {
        List<Country> countryList = countryRepository.findAll();
        List<CountryListResponse> responses = new ArrayList<>();

        for (Country country : countryList) {
            CountryListResponse dto = new CountryListResponse();
            dto.setCountryName(country.getCountryName());
            responses.add(dto);
        }
        return responses;
    }

    @Override
    public List<CountryListResponse> search(String query) {
        List<Country> countries = countryRepository.search(query);
        List<CountryListResponse> response = new ArrayList<>();
        for (Country country : countries) {
            CountryListResponse countryListResponse = new CountryListResponse(country.getCountryName());
            response.add(countryListResponse);
        }
        return response;
    }

    private void countryWithSameNameShouldNotExist(String name) {
        Optional<Country> countryWithSameName = countryRepository.findByCountryName(name);
        if (countryWithSameName.isPresent())
            throw new BusinessException("You cannot add same country with same name!");
    }

    private void isCountryExist(String name) {
        Optional<Country> countryExistChecker = countryRepository.findByCountryName(name);
        if (countryExistChecker.isEmpty())
            throw new BusinessException("Country is not exist!");
    }
}
