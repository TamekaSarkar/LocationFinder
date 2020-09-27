package com.tameka.location.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tameka.location.entities.Location;
import com.tameka.location.repos.Locationrepos;

@RestController
@RequestMapping("/locations")
public class LocationRESTcontroller {
	
	@Autowired
	private Locationrepos locationrepos;
	
	@GetMapping
	public List<Location> getallLocation(){
		return locationrepos.findAll();
	}
	@PostMapping
	public Location createLocation(@RequestBody Location location) {
		return locationrepos.save(location);
	}
	@PutMapping
	public Location updateLocation(@RequestBody Location location) {
		return locationrepos.save(location);
	}
	@DeleteMapping("/{id}")
	public void deleteLocation(@PathVariable("id") int id) {
		locationrepos.deleteById(id);
	}
	@GetMapping("/{id}")
	public Location getLocation(@PathVariable int id) {
		return locationrepos.findById(id).get();
	}
	
	

}
