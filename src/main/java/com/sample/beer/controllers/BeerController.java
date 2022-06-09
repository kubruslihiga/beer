package com.sample.beer.controllers;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.beer.beans.Beer;

@RestController
public class BeerController {

	private static final List<Beer> BEERS = Arrays.asList(new Beer("1", "Brahma", "SAP1", "SALESFORCE1"), new Beer("2", "SKOLL", "SAP2", "SALESFORCE2"),
			new Beer("3", "Antartica", "SAP3", "SALESFORCE3"), new Beer("4", "Stella Artois", "SAP4", "SALESFORCE4"));

	@GetMapping("beer")
	public List<Beer> getBeers() {
		return BEERS;
	}
	
	@GetMapping("beer/{id}")
	public Beer getBeer(@PathVariable("id") String id) {
		Optional<Beer> findFirst = BEERS.stream().filter(beer -> beer.getId().equals(id)).findFirst();
		if (findFirst.isEmpty()) {
			return new Beer();
		}
		return findFirst.get();
	}

	@PostMapping("beer")
	public Beer postBeer(Map<String, Object> beerData) {
		Object brandObject = beerData.get("brand");
		if (brandObject != null) {
			String brand = (String) brandObject;
		}
		String uuid = UUID.randomUUID().toString();
		return new Beer(uuid, "CERVEJA", uuid, uuid);
	}
}
