package springBackEnd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springBackEnd.dao.CountryDAO;
import springBackEnd.dto.Country;

import java.util.List;

@Service
public class CountryService {

    @Autowired
    private CountryDAO countryDAO;


    public Country findCountryByName(String country) {
        return countryDAO.findByCountry(country);
    }

    public List<Country> getAllCountries() {
        return countryDAO.findAll();
    }
}
