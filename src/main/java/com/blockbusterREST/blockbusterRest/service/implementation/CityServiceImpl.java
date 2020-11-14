package com.blockbusterREST.blockbusterRest.service.implementation;

import com.blockbusterREST.blockbusterRest.domain.City;
import com.blockbusterREST.blockbusterRest.repositories.CityRepository;
import com.blockbusterREST.blockbusterRest.service.CityService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImpl implements CityService {

    private CityRepository cityRepository;
    CityServiceImpl(CityRepository cityRepository){
        this.cityRepository= cityRepository;
    }

    @Override
    public ResponseEntity<City> saveCity(City city) {
        for(City city1 : this.cityRepository.findAll()){
            if (city1.getName().contains(city.getName())){
                System.out.println("City already exists");
                return null;
            }
        }
        City tempCity = this.cityRepository.save(city);
        return new ResponseEntity<City>(tempCity, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<City>> getCities() {
        List<City> cityList = this.cityRepository.findAll();
        return new ResponseEntity<List<City>>(cityList,HttpStatus.OK);
    }

    @Override
    public void deleteCityById(Long id) {
        this.cityRepository.deleteById(id);
    }
}
