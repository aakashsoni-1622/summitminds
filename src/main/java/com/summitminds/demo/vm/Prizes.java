package com.summitminds.demo.vm;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true,value = {"hibernateLazyInitializer","handler"})
public class Prizes {

private String year;
	
	private String category;
	
	private String overallMotivation;
	
	private List<Laureates> laureates;

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getOverallMotivation() {
		return overallMotivation;
	}

	public void setOverallMotivation(String overallMotivation) {
		this.overallMotivation = overallMotivation;
	}

	public List<Laureates> getLaureates() {
		return laureates;
	}

	public void setLaureates(List<Laureates> laureates) {
		this.laureates = laureates;
	}

}
