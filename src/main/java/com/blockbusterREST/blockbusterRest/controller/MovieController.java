package com.blockbusterREST.blockbusterRest.controller;

import com.blockbusterREST.blockbusterRest.domain.Movie;
import com.blockbusterREST.blockbusterRest.dto.MovieDto;
import com.blockbusterREST.blockbusterRest.service.MovieService;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public ResponseEntity<Movie> findMovieByName(@PathVariable String title){
        Movie movie = this.movieService.findMovieByTitle(title);
        return new ResponseEntity<Movie>(movie,HttpStatus.OK);

    }

    @GetMapping("/order/runtime")
    public ResponseEntity<List<MovieDto>> orderByRuntime(){
        return this.movieService.orderByRuntime();
    }




}
