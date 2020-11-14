package com.blockbusterREST.blockbusterRest.service.implementation;

import com.blockbusterREST.blockbusterRest.domain.Director;
import com.blockbusterREST.blockbusterRest.repositories.DirectorRepository;
import com.blockbusterREST.blockbusterRest.service.DirectorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DirectorServiceImpl implements DirectorService {

    DirectorRepository directorRepository;
    DirectorServiceImpl(DirectorRepository directorRepository){
        this.directorRepository = directorRepository;
    }

    @Override
    public ResponseEntity<Director> saveDirector(Director director) {
        Director director1 = this.directorRepository.save(director);
        return new ResponseEntity<Director>(director1,HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<Director>> getALlDirectors() {
        List<Director> directors = this.directorRepository.findAll();
        return new ResponseEntity<List<Director>>(directors, HttpStatus.OK);
    }

}
