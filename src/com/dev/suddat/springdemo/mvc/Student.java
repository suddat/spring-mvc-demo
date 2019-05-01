package com.dev.suddat.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {

	private String firstName;
	private String lastName;
	private String country;

	private LinkedHashMap<String, String> countryOptions;

	// get data from a class instead of hard-coded
	private LinkedHashMap<String, String> favoriteLanguageOptions;
	
	private String[] operatingSystem;

	private String favoriteLanguage;

	public String getFavoriteLanguage() {
		System.out.println("Student: getFavoriteLanguage Called");
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public Student() {
		// populate country options
		countryOptions = new LinkedHashMap<>();
		countryOptions.put("BR", "Brazil");
		countryOptions.put("FR", "France");
		countryOptions.put("DE", "Germany");
		countryOptions.put("IN", "India");
		countryOptions.put("US", "United States ofAmerica");
		
		favoriteLanguageOptions = new LinkedHashMap<>();
		favoriteLanguageOptions.put("Java", "Java");
		favoriteLanguageOptions.put("C#", "C#");
		favoriteLanguageOptions.put("PHP", "PHP");
		favoriteLanguageOptions.put("RUBY", "RUBY");
	}

	public String getCountry() {
		System.out.println("Student: getCountry Called");
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getFirstName() {
		System.out.println("Student: getFirstName Called");
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		System.out.println("Student: getLastName Called");
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		System.out.println("Student: getCountryOptions Called");
		return countryOptions;
	}

	public LinkedHashMap<String, String> getFavoriteLanguageOptions() {
		System.out.println("Student: getFavoriteLanguageOptions Called");
		return favoriteLanguageOptions;
	}

	public String[] getOperatingSystem() {
		System.out.println("Student: getOperatingSystem Called");
		return operatingSystem;
	}

	public void setOperatingSystem(String[] operatingSystem) {
		System.out.println("Student: setOperatingSystem Called");
		this.operatingSystem = operatingSystem;
	}	
}
