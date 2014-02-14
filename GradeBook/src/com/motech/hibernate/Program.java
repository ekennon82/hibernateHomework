package com.motech.hibernate;


import java.util.HashSet;
import java.util.Set;

import org.hibernate.NonUniqueResultException;
import org.hibernate.Session;

public class Program {

	public static void main(String[] args) {
		
		Student student1 = new Student();
		student1.setName("Erin");
		
		Student student2 = new Student();
		student2.setName("Kathleen");
		
		Address hAddress1 = new Address();
		hAddress1.setAddressType(AddressType.HOME);
		hAddress1.setAddressLine1("some line 1");
		hAddress1.setCity("stl");
		hAddress1.setState("MO");
		hAddress1.setZip("63011");
		
		Address sAddress1 = new Address();
		sAddress1.setAddressType(AddressType.SCHOOL);
		sAddress1.setAddressLine1("address");
		sAddress1.setCity("stcharles");
		sAddress1.setState("MO");
		sAddress1.setZip("63023");
		
		Address wAddress2 = new Address();
		wAddress2.setAddressType(AddressType.WORK);
		wAddress2.setAddressLine1("meridian");
		wAddress2.setCity("brentwood");
		wAddress2.setState("MO");
		wAddress2.setZip("63021");
		
		Address hAddress2 = new Address();
		hAddress2.setAddressType(AddressType.HOME);
		hAddress2.setAddressLine1("sugartree");
		hAddress2.setCity("stl");
		hAddress2.setState("MO");
		hAddress2.setZip("63136");
		
		Set addresses1 = new HashSet();
		addresses1.add(hAddress1);
		addresses1.add(sAddress1);
		
		Set addresses2 = new HashSet();
		addresses2.add(wAddress2);
		addresses2.add(hAddress2);
		
		student1.setAddresses(addresses1);
		student2.setAddresses(addresses2);
		
		Course java = new Course();
		java.setCourseName("CSP 443");
		java.setCreditHours(3.0f);
		
		Course csharp = new Course();
		csharp.setCourseName("CSP 445");
		csharp.setCreditHours(3.0f);
		
		Set courses = new HashSet();
		courses.add(java);
		courses.add(csharp);
		
		student1.setCourses(courses);
		student2.setCourses(courses);
		
		Grade javaGrade1 = new Grade(student1,java,3.5f);
		Grade csharpGrade1 = new Grade(student1,csharp,2.5f);
		Grade javaGrade2 = new Grade(student2,java,3.0f);
		Grade csharpGrade2 = new Grade(student2, csharp,4.0f);
		
		Instructor instructor = new Instructor();
		instructor.setFName("Bryan");
		instructor.setLName("Weaver");
		instructor.setCourses(courses);
		
		Rating rating1 = new Rating();
		rating1.setCourse(csharp);
		rating1.setInstructor(instructor);
		rating1.setRating(8.0d);
		
		Rating rating2 = new Rating();
		rating2.setCourse(java);
		rating2.setInstructor(instructor);
		rating2.setRating(9.0d);
		
		Session session = HibernateUtilities.getSessionFactory().openSession();
		session.beginTransaction();
		
		session.save(student1);
		session.save(student2);
		session.save(javaGrade1);
		session.save(javaGrade2);
		session.save(csharpGrade1);
		session.save(csharpGrade2);
		session.save(instructor);
		session.save(rating1);
		session.save(rating2);
		
		session.getTransaction().commit();
		session.close();
		
		double cGPA1 = GradeBookBusinessLogic.calcCumulativeGPA(student1);
		System.out.println(student1.getName() + " cumulative GPA " + cGPA1);
		student1.setGpa((float) cGPA1);
		
		double cGPA2 = GradeBookBusinessLogic.calcCumulativeGPA(student2);
		System.out.println(student2.getName() + " cumulative GPA " + cGPA2);
		student1.setGpa((float) cGPA2); 
		
//		Session sessionGpa = HibernateUtilities.getSessionFactory().openSession();
//		sessionGpa.beginTransaction();
//		
//		sessionGpa.save(student1);
//		sessionGpa.save(student2);
//		
//		sessionGpa.getTransaction().commit();
//		sessionGpa.close();
		
		double ratingResult1=0.0d;
		try {
			ratingResult1 = GradeBookBusinessLogic.calcAverageRating(instructor);
		} catch (NonUniqueResultException ex) {
		}
		System.out.println(instructor.getFName() + " " + instructor.getLName() + "'s rating is " + ratingResult1);
		//student1.setGpa((float) ratingResult1);
	}
}