package TA27_E4.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import TA27_E4.dto.Country;

public interface CountryDAO extends JpaRepository<Country, Long> {

}
