package com.motech.hibernate;

import java.util.Set;

public class Student {
	private int id;
	private String name;
	private float gpa;
	private Set addresses;
	private Set courses;

	/**
	 * @return the courses
	 */
	public Set getCourses() {
		return courses;
	}

	/**
	 * @param courses the courses to set
	 */
	public void setCourses(Set courses) {
		this.courses = courses;
	}

	/**
	 * @return the addresses
	 */
	public Set getAddresses() {
		return addresses;
	}

	/**
	 * @param addresses the addresses to set
	 */
	public void setAddresses(Set addresses) {
		this.addresses = addresses;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * @return the gpa
	 */
	public float getGpa() {
		return gpa;
	}
	
	/**
	 * @param gpa the gpa to set
	 */
	public void setGpa(float gpa) {
		this.gpa = gpa;
	}
}
