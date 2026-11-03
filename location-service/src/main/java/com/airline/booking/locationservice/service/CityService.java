package com.airline.booking.locationservice.service;

import com.airline.booking.locationservice.dto.CityRequest;
import com.airline.booking.locationservice.dto.CityResponse;
import com.airline.booking.locationservice.repository.CityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CityService {

    private final CityRepository cityRepository;



    public CityResponse createCity(CityRequest request) {




        return null;
    }


    public CityResponse getCityById(Long id) {

        return null;
    }

    public CityResponse updateCity(Long id, CityRequest request) {


        return null;
    }


    public void deleteCity(Long id) {

    }

    public Page<CityResponse> getAllCities(Pageable pageable) {



        return null;
    }


    public Page<CityResponse>  searchCities(String keyword, Pageable pageable) {



        return null;
    }


    public Page<CityResponse>  getCitiesByCountryCode(String countryCode, Pageable pageable) {



        return null;
    }

    public Boolean cityExistsByCityCode(String cityCode) {





        return false;
    }

    public Boolean validateCityCode(String cityCode) {






        return false;
    }




}
