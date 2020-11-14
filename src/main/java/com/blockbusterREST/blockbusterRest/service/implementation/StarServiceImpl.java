package com.blockbusterREST.blockbusterRest.service.implementation;

import com.blockbusterREST.blockbusterRest.domain.Star;
import com.blockbusterREST.blockbusterRest.repositories.StarRepository;
import com.blockbusterREST.blockbusterRest.service.StarService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StarServiceImpl implements StarService {
    private StarRepository starRepository;

    public StarServiceImpl(StarRepository starRepository) {
        this.starRepository = starRepository;
    }

    @Override
    public ResponseEntity<Star> saveStar(Star star) {
        Star tempStar = this.starRepository.save(star);
        return new ResponseEntity<Star>(tempStar, HttpStatus.OK);
    }

    @Override
    public void deleteById(Long id) {
        this.starRepository.deleteById(id);
    }

    @Override
    public ResponseEntity<List<Star>> getAllStars() {
        List<Star> stars = this.starRepository.findAll();
        return new ResponseEntity<List<Star>>(stars,HttpStatus.OK);
    }
}
