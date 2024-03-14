package com.tahahanci.turkcell_ecommerce.services.concretes;

import com.tahahanci.turkcell_ecommerce.entities.City;
import com.tahahanci.turkcell_ecommerce.entities.District;
import com.tahahanci.turkcell_ecommerce.repositories.abstracts.CityRepository;
import com.tahahanci.turkcell_ecommerce.repositories.abstracts.DistrictRepository;
import com.tahahanci.turkcell_ecommerce.services.abstracts.DistrictService;
import com.tahahanci.turkcell_ecommerce.services.dtos.district.requests.DistrictAddRequest;
import com.tahahanci.turkcell_ecommerce.services.dtos.district.responses.DistrictListResponse;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DistrictServiceImpl implements DistrictService {
    private final DistrictRepository districtRepository;
    private final CityRepository cityRepository;

    public DistrictServiceImpl(DistrictRepository districtRepository, CityRepository cityRepository) {
        this.districtRepository = districtRepository;
        this.cityRepository = cityRepository;
    }

    @Override
    public List<DistrictListResponse> getAll() {
        List<District> districts = districtRepository.findAll();
        List<DistrictListResponse> districtListResponses = new ArrayList<>();
        City city;

        for (District district : districts) {
            DistrictListResponse districtListResponse = new DistrictListResponse();
            districtListResponse.setId(district.getDistrictID());
            districtListResponse.setDistrictName(district.getDistrictName());
            districtListResponse.setCityName(district.getCity().getName());
            districtListResponses.add(districtListResponse);
        }

        return districtListResponses;

    }


    @Override
    public void add(DistrictAddRequest districtAddRequest) {
        District district = new District();

        //find City object from cityId
        City city = cityRepository.findById(districtAddRequest.getCityId()).get();
        district.setCity(city);
        district.setDistrictName(districtAddRequest.getName());

        districtRepository.save(district);
    }

    @Override
    public void deleteById(int id) {
        districtRepository.deleteById(id);
    }
}
