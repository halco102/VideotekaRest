package com.blockbusterREST.blockbusterRest.repositories;

import com.blockbusterREST.blockbusterRest.domain.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MovieRepository extends JpaRepository<Movie,Long> {


    @Query(value = "Select * from movie where title like %?1% ",nativeQuery = true)
    public Movie findMovieByTitle(String title) ;


}
