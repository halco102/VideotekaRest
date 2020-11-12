package com.blockbusterREST.blockbusterRest.service;

import com.blockbusterREST.blockbusterRest.domain.Movie;
import com.blockbusterREST.blockbusterRest.dto.MovieDto;

import java.util.List;

public interface MovieService {

    List<Movie> findAllMovies();
    Movie findMovieById(Long id);
    List<Movie> findMovieByTitle(String title);
}
