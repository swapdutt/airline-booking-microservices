package com.airline.booking.locationservice.mapper;

import com.airline.booking.locationservice.dto.CityRequest;
import com.airline.booking.locationservice.dto.CityResponse;
import com.airline.booking.locationservice.entity.City;

public class CityMapper {

    public static City getCity (CityRequest request) {

        if (request == null) {
            return null;
        }

        return City.builder()
                .name(request.getName())
                .cityCode(request.getCityCode())
                .countryCode(request.getCountryCode())
                .countryName(request.getCountryName())
                .regionCode(request.getRegionCode())
                .timeZoneId(request.getTimeZoneOffset())
                .build();

    }

    public static CityResponse mapToCityResponse(City city) {

        if(city == null) {
            return null;
        }

        return CityResponse.builder()
                .id(city.getId())
                .name(city.getName())
                .countryCode(city.getCountryCode())
                .countryName(city.getCountryName())
                .regionCode(city.getRegionCode())
                .build();

    }


}
