package com.blockbusterREST.blockbusterRest.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class DirectorDto {
    private Long id;
    @NotBlank(message = "First name can not be blank")
    @Size(min = 2, max = 15,message = "First name must be between 2 and 15")
    private String firstName;
    @NotBlank(message = "Last name can not be blank")
    @Size(min = 2, max = 15,message = "Last name must be between 2 and 15")
    private String lastName;
    private CityDto city;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public CityDto getCity() {
        return city;
    }

    public void setCity(CityDto city) {
        this.city = city;
    }
}
