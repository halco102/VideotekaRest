package com.blockbusterREST.blockbusterRest.service;

import com.blockbusterREST.blockbusterRest.domain.City;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface CityService {

    ResponseEntity<City> saveCity(City city);
    ResponseEntity<List<City>> getCities();
    void deleteCityById(Long id);


}
