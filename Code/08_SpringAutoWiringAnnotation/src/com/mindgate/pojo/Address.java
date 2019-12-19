package com.mindgate.pojo;

import org.springframework.stereotype.Component;

@Component
public class Address {
	private String street;
	private String city;
	private String state;

	public Address() {
		// TODO Auto-generated constructor stub
		System.out.println("Address object is created !!");
	}

	public Address(String street, String city, String state) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		System.out.println("Param. Constructor of Address");
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		System.out.println("Setting Street");
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		System.out.println("Setting City");
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		System.out.println("Setting state");
		this.state = state;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", state=" + state + "]";
	}

}
