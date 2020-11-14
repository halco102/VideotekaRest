package com.blockbusterREST.blockbusterRest.controller;

import com.blockbusterREST.blockbusterRest.domain.Director;
import com.blockbusterREST.blockbusterRest.repositories.DirectorRepository;
import com.blockbusterREST.blockbusterRest.service.DirectorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(MovieController.HOME_URL+"/director")
public class DirectorController {

    private DirectorService directorService;
    DirectorController(DirectorService directorService){
        this.directorService=directorService;
    }


    @PostMapping("/save")
    public ResponseEntity<Director> saveDirector (@RequestBody Director director){

        return this.directorService.saveDirector(director);
    }

    @GetMapping("")
    public ResponseEntity<List<Director>> getAllDirectors(){
        return this.directorService.getALlDirectors();
    }
}
