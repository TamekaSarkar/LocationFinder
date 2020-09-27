package com.tameka.location.service;

import java.util.List;

import com.tameka.location.entities.Location;

public interface LocationService {
	
	Location saveLocation(Location location);
	Location updateLocation(Location location);
	Location getLocationById(int id);
	void deleteLocation(Location location);
	List<Location> getallLocation();
	

}
