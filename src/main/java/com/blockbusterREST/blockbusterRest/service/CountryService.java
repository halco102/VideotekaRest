package com.blockbusterREST.blockbusterRest.service;

import com.blockbusterREST.blockbusterRest.domain.Country;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface CountryService {

    ResponseEntity<Country> saveCountry(Country country);
    void deleteCountry(Long id);
    ResponseEntity<List<Country>> getAllCountries();


}
