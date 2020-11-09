package com.blockbusterREST.blockbusterRest.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class CountryDto {

    private Long id;

    @NotBlank(message = "Country name cant be blank")
    @Size(min = 3,max = 40, message = "Country name has to be between 3 and 40")
    private String name;

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
}
