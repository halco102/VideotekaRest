package com.blockbusterREST.blockbusterRest.dto;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;

public class RatingDto {
    private Long id;
    @DecimalMin(value = "1.0", message = "Min rate is 1.0")
    @DecimalMax(value = "10.0", message = "Max rate is 10.0")
    @NotNull(message = "Rating can not be empty")
    private float rating;
    private MovieDto movieDto;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public MovieDto getMovieDto() {
        return movieDto;
    }

    public void setMovieDto(MovieDto movieDto) {
        this.movieDto = movieDto;
    }
}
