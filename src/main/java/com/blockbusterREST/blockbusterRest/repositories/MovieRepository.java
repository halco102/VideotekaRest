package com.blockbusterREST.blockbusterRest.repositories;

import com.blockbusterREST.blockbusterRest.domain.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MovieRepository extends JpaRepository<Movie,Long> {


    @Query(value = "Select * from movie where title like %?1% ",nativeQuery = true)
    public List<Movie> findMovieByTitle(String title) ;

    @Query(value = "Select * from movie order by runtime", nativeQuery = true)
    public List<Movie> orderMoviesByRuntime();

    @Query(value = "Select * from movie order by title", nativeQuery = true)
    public List<Movie> orderByTitle();

    @Query(value = "Select * from movie order by rating desc",nativeQuery = true)
    public List<Movie> orderByRating();

}
