package com.blockbusterREST.blockbusterRest.service.implementation;

import com.blockbusterREST.blockbusterRest.domain.Country;
import com.blockbusterREST.blockbusterRest.repositories.CountryRepository;
import com.blockbusterREST.blockbusterRest.service.CountryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryServiceImpl implements CountryService {
    private CountryRepository countryRepository;

    public CountryServiceImpl(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    @Override
    public ResponseEntity<Country> saveCountry(Country country) {
        Country country1 = this.countryRepository.save(country);
        return new ResponseEntity<Country>(country1, HttpStatus.OK);
    }

    @Override
    public void deleteCountry(Long id) {
        this.countryRepository.deleteById(id);
    }

    @Override
    public ResponseEntity<List<Country>> getAllCountries() {
        List<Country> countries = this.countryRepository.findAll();
        return new ResponseEntity<List<Country>>(countries,HttpStatus.OK);
    }
}
