package com.summitminds.demo.vm;

public class ListWinner {

	private String id;


	private String year;

	private String category;


	public ListWinner(String id, String year, String category, String firstname, String surname, String motivation,
			String share) {
	
		this.id = id;
		this.year = year;
		this.category = category;
		this.firstname = firstname;
		this.surname = surname;
		this.motivation = motivation;
		this.share = share;
	}

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

	private String firstname;

	private String surname;

	private String motivation;

	private String share;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getMotivation() {
		return motivation;
	}

	public void setMotivation(String motivation) {
		this.motivation = motivation;
	}

	public String getShare() {
		return share;
	}

	public void setShare(String share) {
		this.share = share;
	}

}
