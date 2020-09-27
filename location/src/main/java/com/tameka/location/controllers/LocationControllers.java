package com.tameka.location.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tameka.location.entities.Location;
import com.tameka.location.service.LocationService;



@Controller
public class LocationControllers {
	
	@Autowired
	LocationService locationService;
	
	@RequestMapping("/show")
	public String ShowCreate() {
		return "CreateLocation";
	}
	
	@RequestMapping("/saveLoc")
	public String saveLocation(@ModelAttribute("location")Location location, ModelMap modelMap) {
		Location saveLocation = locationService.saveLocation(location);
		String msg = "Location saved with id:" + saveLocation.getId();
		modelMap.addAttribute("msg", msg);
		return "CreateLocation";
		
	}
	
	@RequestMapping("/displayLocations")
	public String displayLocations(ModelMap modelMap) {
		List<Location>locations = locationService.getallLocation();
		modelMap.addAttribute("locations", locations);
		
		return "displayLocations";
	}
	@RequestMapping("/deleteLocation")
	public String deleteLocation(@RequestParam("id")int id,ModelMap modelMap) {
		Location locationById = locationService.getLocationById(id);
		locationService.deleteLocation(locationById);
		List<Location>locations = locationService.getallLocation();
		modelMap.addAttribute("locations", locations);
		return "displayLocations";
	}
	@RequestMapping("/showUpdate")
	public String showUpdate(@RequestParam("id")int id,ModelMap modelMap) {
		Location location = locationService.getLocationById(id);
		modelMap.addAttribute("location", location);
		return "editLocation";
	}
	
	@RequestMapping("/updateLoc")
	public String upadteLocation(@ModelAttribute("location")Location location, ModelMap modelMap) {
		locationService.updateLocation(location);
	
		List<Location>locations = locationService.getallLocation();
		modelMap.addAttribute("locations", locations);
		return "displayLocations";
	}

}
