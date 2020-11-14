package com.blockbusterREST.blockbusterRest.service;

import com.blockbusterREST.blockbusterRest.domain.Director;
import com.blockbusterREST.blockbusterRest.domain.Movie;
import com.blockbusterREST.blockbusterRest.dto.MovieDto;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface MovieService {

    List<Movie> findAllMovies();
    Movie findMovieById(Long id);
    List<Movie> findMovieByTitle(String title);
    ResponseEntity<Movie> saveMovie(Movie movie);
    void deleteMovieById(Long id);
    ResponseEntity<List<MovieDto>> orderByRuntime();
    List<Movie> orderByTitle();
    List<Movie> orderByRating();

}
