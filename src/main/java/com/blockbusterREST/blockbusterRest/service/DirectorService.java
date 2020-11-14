package com.blockbusterREST.blockbusterRest.service;

import com.blockbusterREST.blockbusterRest.domain.Director;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface DirectorService {
    ResponseEntity<Director> saveDirector(Director director);
    ResponseEntity<List<Director>> getALlDirectors();
}
