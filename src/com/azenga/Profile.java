package com.azenga;

import java.util.ArrayList;

public class Profile {

	private String firstName, lastName, town, country, nationality, email;
	private String[] interests;

	private ArrayList<Profile> friends;

	// Date of Birth
	int day, month, year;

	public Profile(String firstName, String lastName, int day, int month, int year, String town, String country,
			String nationality, String email, String interests[]) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.day = day;
		this.month = month;
		this.year = year;
		this.town = town;
		this.country = country;
		this.nationality = nationality;
		this.email = email;
		this.interests = interests;

		// Initialize the friends ArrayList
		friends = new ArrayList<Profile>();

	}

	// Getters
	public String getTown() {
		return town;
	}

	public String getCountry() {
		return country;
	}

	public String getNationality() {
		return nationality;
	}

	public String[] getIntrests() {
		return interests;
	}

	// Setters
	public void setTown(String town) {
		this.town = town;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public void setInterests(String[] interests) {
		this.interests = interests;
	}

	public String getDateOfBirth() {
		return String.format("%02d/%02d/%04d", day, month, year);
	}

	public void addFriend(Profile profile) {
		friends.add(profile);
	}

	public Profile getFriend(int posistion) {
		return friends.get(posistion);
	}

	public int getNumberOgFriends() {
		return friends.size();
	}

	public String getEmail() {
		return this.email;
	}

	public String getName() {
		return String.format("%s %s", firstName, lastName);
	}

	@Override
	public String toString() {
		return String.format("%s was born in %s has %d friends and loves %s", firstName, getDateOfBirth(),
				friends.size(), interests[0]);
	}

}
