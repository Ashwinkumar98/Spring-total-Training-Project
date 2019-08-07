package com.cts.jpa.hib.demo.UI;

import java.util.TreeSet;

import javax.persistence.EntityManager;

import com.cts.jpa.hib.demo.model.oneTomany.Course;
import com.cts.jpa.hib.demo.model.oneTomany.Trainee;
import com.cts.jpa.hib.demo.util.JPAUtil;

public class Example5 {
	 
	public static void main(String[] args) {
		
		Course mca = new Course(101,"MCA",new TreeSet<Trainee>());
		Course mba = new Course(102,"MBA",new TreeSet<Trainee>());
		
		mca.getTrainees().add(new Trainee(1, "Kisanth", mca));
		mca.getTrainees().add(new Trainee(2, "Vinoth", mca));
		mca.getTrainees().add(new Trainee(3, "pugal", mca));
		
		mba.getTrainees().add(new Trainee(4, "mohan", mba));
		mba.getTrainees().add(new Trainee(5, "Lokesh", mba));
		mba.getTrainees().add(new Trainee(6, "Mohammed", mba));
		
		
		EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
		
		em.getTransaction().begin();
		em.persist(mca);
		em.persist(mba);
		em.getTransaction().commit();
		
		System.out.println("Customer Saved !!");
		
		JPAUtil.shutdown();
	}
}
