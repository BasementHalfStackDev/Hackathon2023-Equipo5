package springBackEnd.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import springBackEnd.dto.Country;

public interface CountryDAO extends JpaRepository<Country, Long> {

}
