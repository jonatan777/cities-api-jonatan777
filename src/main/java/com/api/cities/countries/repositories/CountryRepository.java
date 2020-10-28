package com.api.cities.countries.repositories;

import org.springframework.data.jpa.repository.JpaRepository; 

import com.api.cities.countries.entities.Country;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
