package com.summitminds.demo.vm;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true,value = {"hibernateLazyInitializer","handler"})
public class Winners {

	private List<Prizes> prizes;

	private List<Laureates> laureates1s;



	public List<Laureates> getLaureates1s() {
		return laureates1s;
	}

	public void setLaureates1s(List<Laureates> laureates1s) {
		this.laureates1s = laureates1s;
	}

	public List<Prizes> getPrizes() {
		return prizes;
	}

	public void setPrizes(List<Prizes> prizes) {
		this.prizes = prizes;
	}

}
