package com.motech.hibernate;

import java.util.Set;


public class Course {
	private int id;
	private String courseName;
	private float creditHours;
	private Set students;
	private Instructor instructor;
	
	/**
	 * @return the instructor
	 */
	public Instructor getInstructor() {
		return instructor;
	}

	/**
	 * @param instructor the instructor to set
	 */
	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}

	/**
	 * @return the students
	 */
	public Set getStudents() {
		return students;
	}

	/**
	 * @param students the students to set
	 */
	public void setStudents(Set students) {
		this.students = students;
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
	 * @return the courseName
	 */
	public String getCourseName() {
		return courseName;
	}
	
	/**
	 * @param courseName the courseName to set
	 */
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	/**
	 * @return the creditHours
	 */
	public float getCreditHours() {
		return creditHours;
	}
	
	/**
	 * @param creditHours the creditHours to set
	 */
	public void setCreditHours(float creditHours) {
		this.creditHours = creditHours;
	}
}
