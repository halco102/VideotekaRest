package com.blockbusterREST.blockbusterRest.service.implementation;

import com.blockbusterREST.blockbusterRest.domain.Movie;
import com.blockbusterREST.blockbusterRest.dto.MovieDto;
import com.blockbusterREST.blockbusterRest.repositories.MovieRepository;
import com.blockbusterREST.blockbusterRest.service.MovieService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {
    private final MovieRepository movieRepository;

    public MovieServiceImpl(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public List<Movie> findAllMovies() {

        return this.movieRepository.findAll();
    }

    @Override
    public Movie findMovieById(Long id) {
        return movieRepository.findById(id).get();
    }

    @Override
    public List<Movie> findMovieByTitle(String title) {
        return this.movieRepository.findMovieByTitle(title);
    }
}
