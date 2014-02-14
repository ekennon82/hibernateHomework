package com.motech.hibernate;

public class Grade {
	private int id;
	private Student student;
	private Course course;
	private float grade;
	
	public Grade() {};
	
	
	/**
	 * @param student
	 * @param course
	 * @param grade
	 */
	public Grade(Student student, Course course, float grade) {
		//super();
		this.student = student;
		this.course = course;
		this.grade = grade;
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
	 * @return the student
	 */
	public Student getStudent() {
		return student;
	}
	/**
	 * @param student the student to set
	 */
	public void setStudent(Student student) {
		this.student = student;
	}
	/**
	 * @return the course
	 */
	public Course getCourse() {
		return course;
	}
	/**
	 * @param course the course to set
	 */
	public void setCourse(Course course) {
		this.course = course;
	}
	/**
	 * @return the grade
	 */
	public float getGrade() {
		return grade;
	}
	/**
	 * @param grade the grade to set
	 */
	public void setGrade(float grade) {
		this.grade = grade;
	}
}