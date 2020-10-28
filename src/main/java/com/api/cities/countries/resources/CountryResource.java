package com.api.cities.countries.resources;


import java.util.List; 
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.cities.countries.entities.Country;
import com.api.cities.countries.repositories.CountryRepository;

@RestController
public class CountryResource {

  private final CountryRepository repository;

  public CountryResource(final CountryRepository repository) {
    this.repository = repository;
  }

  @GetMapping("/countries")
  public List<Country> cities() {

    return repository.findAll();
  }
}
