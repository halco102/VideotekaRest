package com.blockbusterREST.blockbusterRest.controller;

import com.blockbusterREST.blockbusterRest.domain.City;
import com.blockbusterREST.blockbusterRest.service.CityService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(MovieController.HOME_URL+"/city")
public class CityController {

    CityService cityService;
    CityController(CityService cityService){
        this.cityService=cityService;
    }


    @GetMapping("")
    public ResponseEntity<List<City>> getAllCities(){
        return this.cityService.getCities();
    }

    @PostMapping("/save")
    public ResponseEntity<City> saveCity(@RequestBody City city){
        return this.cityService.saveCity(city);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteCityById(@PathVariable Long id){
        this.cityService.deleteCityById(id);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}
