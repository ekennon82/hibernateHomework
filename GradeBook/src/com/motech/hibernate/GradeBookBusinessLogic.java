package com.motech.hibernate;

import org.hibernate.NonUniqueResultException;
import org.hibernate.Query;
import org.hibernate.Session;

public class GradeBookBusinessLogic {

	public static double calcCumulativeGPA(Student student) {
		double attemptedHours = 0.0d;
		double qualityPoints = 0.0d;
		double averageRating = 0.0d;
		
		Session session = HibernateUtilities.getSessionFactory().openSession();
		
		session.beginTransaction();
		
		Query query = session.getNamedQuery("AttemptedHours").setString("name", student.getName());
		
		attemptedHours = (double) query.uniqueResult();
		
		Query qp = session.getNamedQuery("QualityPoints").setString("name", student.getName());
		
		qualityPoints = (double) qp.uniqueResult();
		
		session.getTransaction().commit();
		session.close();
		
		return qualityPoints/attemptedHours;
	}
	
	public static double calcAverageRating(Instructor instructor) throws NonUniqueResultException {
		double averageRating = 0;
		long c = 0;
		
		Session session = HibernateUtilities.getSessionFactory().openSession();
		
		session.beginTransaction();
		
		Query avgRating = session.getNamedQuery("AverageRating").setString("name", instructor.getLName());
		Query count = session.getNamedQuery("countCourses").setString("name", instructor.getLName());
		
		averageRating = (double) avgRating.uniqueResult();
		c = (long) count.uniqueResult();
		double cnt = (double) c;
		averageRating /= cnt;
		//System.out.println(averageRating);
		session.getTransaction().commit();
		session.close();
		
		return averageRating;
	}
}
