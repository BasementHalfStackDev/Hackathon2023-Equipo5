package springBackEnd.service;

import org.springframework.beans.factory.annotation.Autowired;
import springBackEnd.dao.CountryDAO;
import springBackEnd.dto.Country;

import java.util.List;

public class CountryService {

    @Autowired
    private CountryDAO countryDAO;


    public Country findCountryByName(String country) {
        return countryDAO.findByCountryName(country);
    }

    public List<Country> getAllCountries() {
        return countryDAO.findAll();
    }
}
