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
@RequestMapping(MovieController.HOME_URL)
public class MovieController {

    public static final String HOME_URL = "/api/v1";

    private final MovieService movieService;
    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }


    @GetMapping("/movies")
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

    @GetMapping("/order/runtime")
    public ResponseEntity<List<MovieDto>> orderByRuntime(){
        return this.movieService.orderByRuntime();
    }

    @GetMapping("/order/title")
    public ResponseEntity<List<Movie>> orderByTitle(){
        List<Movie> movies = this.movieService.orderByTitle();
        return new ResponseEntity<List<Movie>>(movies,HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteMovieById(@PathVariable Long id)
    {
        movieService.deleteMovieById(id);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<Movie> saveMovie(@RequestBody Movie movie){
        return this.movieService.saveMovie(movie);
    }

    @GetMapping("/order/rating")
    public ResponseEntity<List<Movie>> orderByRating(){
        List<Movie> movies = this.movieService.orderByRating();
        return new ResponseEntity<List<Movie>>(movies,HttpStatus.OK);
    }



}
