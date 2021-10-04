package com.summitminds.demo.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.summitminds.demo.serviceimpl.NobleService;
import com.summitminds.demo.vm.Laureates;
import com.summitminds.demo.vm.ListWinner;

@RestController
@RequestMapping("/noblewinner")
public class NobleController {

	@Autowired
	private NobleService nobleService;
	
	@GetMapping("/winnerbyname/{name}")
	public Laureates searchWinnerByName(@PathVariable String name) throws IOException{
		
		Laureates pList = nobleService.nobleWinnerByName(name);
		
		return pList;
	}
	
	
	@GetMapping("/winnerbyyear/{year}")
	public List<Laureates> searchWinnerByYear(@PathVariable String year) throws IOException{
		
		List<Laureates> pList = nobleService.nobleWinnerByYear(year);
		
		return pList;
	}
	
	
	@GetMapping("/winnerbycategory/{category}")
	public List<Laureates> searchWinnerByCategory(@PathVariable String category) throws IOException{
		
		List<Laureates> pList = nobleService.nobleWinnerByCategory(category);
		
		return pList;
	}
	
	
	@GetMapping("/allwinners")
	public List<ListWinner> searchAllWinner() throws IOException{
		
		List<ListWinner> pList = nobleService.winnerAllNames();
		
		return pList;
	}
}
