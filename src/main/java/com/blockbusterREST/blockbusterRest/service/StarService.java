package com.blockbusterREST.blockbusterRest.service;

import com.blockbusterREST.blockbusterRest.domain.Star;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface StarService {

    ResponseEntity<Star> saveStar(Star star);
    void deleteById(Long id);
    ResponseEntity<List<Star>> getAllStars();

}
