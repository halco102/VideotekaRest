package com.blockbusterREST.blockbusterRest.dto;


import javax.validation.constraints.*;
import java.util.ArrayList;
import java.util.List;

public class MovieDto {
    private Long id;

    @NotBlank(message = "Title can not be blank ")
    @Size(min = 2, max = 40,message = "Title must be between 2 and 40")
    private String title;
    @NotNull(message = "Year can not be blank")
    @Min(value = 1960,message = "Minimum year is 1960")
    private int year;
    @NotNull(message = "Runtime can not be blank")
    @Min(value = 30,message = "Minimum runtime is 30")
    private int runtime;
    @NotNull(message = "Rate can not be empty")
    @DecimalMin(value = "1.0",message = "Min rate is 1.0")
    @DecimalMax(value = "10.0",message = "Max rate is 10.0")
    private float rating;
    private int votes;
    private String imageUrl;
    private CityDto cityDto;
    public List<StarDto> stars = new ArrayList<>();
    public List<DirectorDto> directors = new ArrayList<>();
    public List<GenreDto> genres = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getRuntime() {
        return runtime;
    }

    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public int getVotes() {
        return votes;
    }

    public void setVotes(int votes) {
        this.votes = votes;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public CityDto getCityDto() {
        return cityDto;
    }

    public void setCityDto(CityDto cityDto) {
        this.cityDto = cityDto;
    }
}
