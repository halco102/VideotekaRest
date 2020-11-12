package com.blockbusterREST.blockbusterRest.controller;

import com.blockbusterREST.blockbusterRest.domain.Movie;
import com.blockbusterREST.blockbusterRest.dto.MovieDto;
import com.blockbusterREST.blockbusterRest.service.MovieService;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/movies")
public class MovieController {

    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }


    @GetMapping("")
    public ResponseEntity<List<Movie>> getAllMovies (){
        List<Movie> movies = movieService.findAllMovies();
        return new ResponseEntity<List<Movie>>(movies, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Movie> findMovieById(@PathVariable Long id){
        Movie movie = movieService.findMovieById(id);
        return new ResponseEntity<Movie>(movie,HttpStatus.OK);
    }

    @GetMapping("/title/{title}")
    public ResponseEntity<List<Movie>> findMovieByName(@PathVariable String title){
        List<Movie> movie = this.movieService.findMovieByTitle(title);
        return new ResponseEntity<List<Movie>>(movie,HttpStatus.OK);

    }

    @PostMapping("/add")
    public ResponseEntity<Movie> saveMovie(@RequestBody Movie movie){
        return this.movieService.saveMovie(movie);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteMovieById(@PathVariable Long id){
        movieService.deleteMovieById(id);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }


}
