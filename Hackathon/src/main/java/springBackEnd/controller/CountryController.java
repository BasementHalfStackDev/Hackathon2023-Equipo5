package springBackEnd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springBackEnd.dto.Country;
import springBackEnd.service.CountryService;

import java.util.List;

@RestController
@RequestMapping("/countries")
public class CountryController {

    @Autowired
    CountryService countryService;

    @GetMapping("/getOne")
    public ResponseEntity<Country> getCountry(@PathVariable String country) throws Exception {
        try {
            return ResponseEntity.ok(countryService.findCountryByName(country));
        } catch (Exception e) {
            throw new Exception("Error while getting a country", e);
        }
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Country>> getAllContries() throws Exception {
        try {
            return ResponseEntity.ok(countryService.getAllCountries());
        } catch (Exception e) {
            throw new Exception("Error while getting all countries", e);
        }
    }



}
