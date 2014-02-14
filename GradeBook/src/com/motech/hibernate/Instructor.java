package com.motech.hibernate;

import java.util.Set;



public class Instructor {
	private int id;
	private String fName;
	private String lName;
	private Set courses;
	
	/**
	 * @return the course
	 */
	public Set getCourses() {
		return courses;
	}
	/**
	 * @param course the course to set
	 */
	public void setCourses(Set courses) {
		this.courses = courses;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the fName
	 */
	public String getFName() {
		return fName;
	}
	/**
	 * @param fName the fName to set
	 */
	public void setFName(String fName) {
		this.fName = fName;
	}
	/**
	 * @return the lName
	 */
	public String getLName() {
		return lName;
	}
	/**
	 * @param lName the lName to set
	 */
	public void setLName(String lName) {
		this.lName = lName;
	}

}
