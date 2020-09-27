package com.tameka.location.repos;

import org.springframework.data.jpa.repository.JpaRepository;


import com.tameka.location.entities.Location;


public interface Locationrepos extends JpaRepository<Location, Integer> {

}
