package com.summitminds.demo.serviceimpl;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.summitminds.demo.vm.Laureates;
import com.summitminds.demo.vm.ListWinner;
import com.summitminds.demo.vm.Prizes;
import com.summitminds.demo.vm.Winners;

@Component
public class NobleService {

	public Laureates nobleWinnerByName(String name) throws IOException{

		Laureates laureates = new Laureates();
		System.out.println("runing");
		ObjectMapper objectmapper = new ObjectMapper();
		Winners winners = objectmapper.readValue(new File("src/main/resources/prize.json"), Winners.class);
		if (winners != null) {
			List<Prizes> prize = winners.getPrizes();
			for(Prizes p: prize) {

				if(p.getLaureates() != null) {
					for(Laureates l: p.getLaureates()) {
						if(l.getFirstname().equalsIgnoreCase(name)) {
							laureates = l;
							break;
						}
					}
				}
			}
		}

		return laureates;

	}

	
	
	public List<Laureates> nobleWinnerByYear(String year) throws IOException{

		List<Laureates> laureateslist = new ArrayList<>();
		ObjectMapper objectmapper = new ObjectMapper();
		Winners winners = objectmapper.readValue(new File("src/main/resources/prize.json"), Winners.class);
		if (winners != null) {
			List<Prizes> prize = winners.getPrizes();
			for(Prizes p: prize) {
				if(p.getYear().equalsIgnoreCase(year)) {
					laureateslist = p.getLaureates();
				}
			}
		}

		return laureateslist;

	}
	
	
	public List<Laureates> nobleWinnerByCategory(String category) throws IOException{

		List<Laureates> laureateslist = new ArrayList<>();
		ObjectMapper objectmapper = new ObjectMapper();
		Winners winners = objectmapper.readValue(new File("src/main/resources/prize.json"), Winners.class);
		if (winners != null) {
			List<Prizes> prize = winners.getPrizes();
			for(Prizes p: prize) {
				if(p.getCategory().equalsIgnoreCase(category)) {
					laureateslist = p.getLaureates();
				}
			}
		}

		return laureateslist;

	}



	public List<ListWinner> winnerAllNames() throws IOException{

		List<ListWinner> listWinners = new ArrayList<>();
		List<Laureates> laureateslist = new ArrayList<>();
		System.out.println("runing");
		ObjectMapper objectmapper = new ObjectMapper();
		Winners winners = objectmapper.readValue(new File("src/main/resources/prize.json"), Winners.class);
		if (winners != null) {
			List<Prizes> prize = winners.getPrizes();
			for(Prizes p: prize) {

				if(p.getYear().equalsIgnoreCase("2018")) {
					laureateslist = p.getLaureates();
				}

				if(p.getLaureates() != null) {

					for(Laureates l: p.getLaureates()) {
						ListWinner listWin = new ListWinner(l.getId(), p.getYear(), p.getCategory(), l.getFirstname(), l.getSurname(), l.getMotivation(),l.getShare());

						listWinners.add(listWin);
					}
				}
			}
		}


		return listWinners;

	}

	
}
