package com.blockbusterREST.blockbusterRest.dto;

import com.blockbusterREST.blockbusterRest.domain.Country;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class CityDto {

    private Long id;

    @Size(min = 3,max = 40,message = "City name must be between 3 and 40")
    private String name;
    @NotNull(message = "Country cant be empty")
    private CountryDto countryDto;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CountryDto getCountryDto() {
        return countryDto;
    }

    public void setCountryDto(CountryDto countryDto) {
        this.countryDto = countryDto;
    }
}
