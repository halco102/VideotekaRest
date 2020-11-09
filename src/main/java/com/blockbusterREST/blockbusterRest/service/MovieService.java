package com.blockbusterREST.blockbusterRest.service;

import com.blockbusterREST.blockbusterRest.domain.Movie;

import java.util.List;

public interface MovieService {

    List<Movie> findAllMovies();
    Movie findMovieById(Long id);

}
