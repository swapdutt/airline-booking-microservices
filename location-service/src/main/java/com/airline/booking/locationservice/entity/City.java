package com.airline.booking.locationservice.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.experimental.FieldDefaults;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
@Entity
@Table(name = "cities")
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Column(nullable = false)
    String name;

    @Column(nullable = false, unique = true)
    String cityCode;

    @Column(nullable = false)
    String countryCode;

    @Column(nullable = false)
    String countryName;

    @Size(max = 10)
    String regionCode;

    @Column(name = "time_zone_id", length = 50)
    String timeZoneId;

}
