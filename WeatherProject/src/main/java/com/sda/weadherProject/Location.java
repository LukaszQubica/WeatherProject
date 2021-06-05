package com.sda.weadherProject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity(name = "locations")
@Data
@NoArgsConstructor


public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "City_name")
    private String cityName;

    @Column(name = "Region")
    private String region;

    @Column(name = "Country")
    private String country;

    @Column(name = "latitude")
    private Double latitude;

    @Column(name= "longitude")
    private Double longitude;

    public Location (Long id, String cityName, String region, String country, Double latitude, Double longitude){
        this.id=id;
        this.cityName = cityName;
        this.region = region;
        this.country=country;
        this.latitude = latitude;
        this.latitude= longitude;

    }

    public Long getId() {
        return id;
    }

    public String getCityName() {
        return cityName;
    }

    public String getRegion() {
        return region;
    }

    public String getCountry() {
        return country;
    }

    public Double getLatitude() {
        return latitude;
    }

    public Double getLongitude() {
        return longitude;
    }
}
