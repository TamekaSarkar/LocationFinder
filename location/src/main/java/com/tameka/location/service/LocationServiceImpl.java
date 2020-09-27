package com.tameka.location.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tameka.location.entities.Location;
import com.tameka.location.repos.Locationrepos;

@Service
public class LocationServiceImpl implements LocationService {

	@Autowired
	private Locationrepos locationrepos;

	@Override
	public Location saveLocation(Location location) {
		return locationrepos.save(location);
	}

	@Override
	public Location updateLocation(Location location) {
		return locationrepos.save(location);
	}

	@Override
	public Location getLocationById(int id) {
		return locationrepos.findById(id).get();
	}

	@Override
	public void deleteLocation(Location location) {
		locationrepos.delete(location);

	}

	@Override
	public List<Location> getallLocation() {
		return locationrepos.findAll();
	}

	public Locationrepos getLocationrepos() {
		return locationrepos;
	}

	public void setLocationrepos(Locationrepos locationrepos) {
		this.locationrepos = locationrepos;
	}

}
