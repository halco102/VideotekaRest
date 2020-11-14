package com.blockbusterREST.blockbusterRest.service.implementation;

import com.blockbusterREST.blockbusterRest.domain.Director;
import com.blockbusterREST.blockbusterRest.domain.Movie;
import com.blockbusterREST.blockbusterRest.dto.MovieDto;
import com.blockbusterREST.blockbusterRest.mapper.MovieMapper;
import com.blockbusterREST.blockbusterRest.repositories.DirectorRepository;
import com.blockbusterREST.blockbusterRest.repositories.MovieRepository;
import com.blockbusterREST.blockbusterRest.service.MovieService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {
    private final MovieRepository movieRepository;
    private final MovieMapper movieMapper;
    private final DirectorRepository directorRepository;
    public MovieServiceImpl(MovieRepository movieRepository, MovieMapper movieMapper, DirectorRepository directorRepository) {
        this.movieRepository = movieRepository;
        this.movieMapper = movieMapper;
        this.directorRepository = directorRepository;
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
    public ResponseEntity<Movie> saveMovie(Movie movie) {
        Movie tempMovie = movieRepository.save(movie);
        return new ResponseEntity<Movie>(tempMovie, HttpStatus.OK);
    }

    @Override
    public void deleteMovieById(Long id) {
        movieRepository.deleteById(id);
    }

    @Override
    public List<Movie> orderByRating() {
        return this.movieRepository.orderByRating();
    }

    @Override
    public List<Movie> orderByTitle() {
        return this.movieRepository.orderByTitle();
    }

    @Override
    public List<Movie> findMovieByTitle(String title) {
        return this.movieRepository.findMovieByTitle(title);
    }


    @Override
    public ResponseEntity<List<MovieDto>> orderByRuntime() {
        List<Movie> movies = this.movieRepository.orderMoviesByRuntime();
        List<MovieDto> movieDtos = movieMapper.listToDto(movies);
        return new ResponseEntity<List<MovieDto>>(movieDtos, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Movie> addDirector(Long movieId, Long directorId) {
        Director director = directorRepository.findById(directorId).get();
        Movie movie = movieRepository.findById(movieId).get();
        if(movie.getDirectors().equals(director)){
            System.out.println("That director is already in this Movie");
            return null;
        }else {
            movie.directors.add(director);
            movieRepository.save(movie);
            return new ResponseEntity<Movie>(movie,HttpStatus.OK);
        }

    }
}
