package com.blockbusterREST.blockbusterRest.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class GenreDto {
    private Long id;
    @NotBlank(message = "Genre can not be blank")
    @Size(min = 4, max = 15,message = "Name must be between 4 and 15")
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
