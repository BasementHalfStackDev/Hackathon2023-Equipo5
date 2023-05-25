package springBackEnd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springBackEnd.dto.Country;
import springBackEnd.service.CountryService;

@RestController
@RequestMapping("/api")
public class CountryController {

    @Autowired
    CountryService countryService;

    @PreAuthorize("hasRole('USER')")
    @GetMapping("/countries")
    public ResponseEntity<List<Country>> getAllContries() throws Exception {
        try {
            return ResponseEntity.ok(countryService.getAllCountries());
        } catch (Exception e) {
            throw new Exception("Error while getting all countries", e);
        }
    }
    
    @PreAuthorize("hasRole('USER')")
    @GetMapping("/countries/name/{country}")
    public ResponseEntity<Country> getCountry(@PathVariable String country) throws Exception {
        try {
            return ResponseEntity.ok(countryService.findCountryByName(country));
        } catch (Exception e) {
            throw new Exception("Error while getting a country", e);
        }
    }
    
    @PreAuthorize("hasRole('USER')")
    @GetMapping("/countries/id/{id}")
    public ResponseEntity<Country> getCountry(@PathVariable Long id) throws Exception {
        try {
            return ResponseEntity.ok(countryService.findCountryById(id));
        } catch (Exception e) {
            throw new Exception("Error while getting a country", e);
        }
    }

    



}
