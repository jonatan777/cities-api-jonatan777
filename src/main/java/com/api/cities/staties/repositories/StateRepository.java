package com.api.cities.staties.repositories;

import org.springframework.data.jpa.repository.JpaRepository; 

import com.api.cities.staties.entities.State;

public interface StateRepository extends JpaRepository<State, Long> {
}
