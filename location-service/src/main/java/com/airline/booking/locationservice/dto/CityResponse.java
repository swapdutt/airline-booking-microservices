package com.airline.booking.locationservice.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

@NoArgsConstructor
@AllArgsConstructor
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class CityResponse {

    Long id;
    String name;
    String cityCode;
    String countryName;
    String countryCode;
    String regionCode;
    String timeZoneOffset;

}
