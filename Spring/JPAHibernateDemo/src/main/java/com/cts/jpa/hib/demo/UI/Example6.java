package com.cts.jpa.hib.demo.UI;

import java.util.TreeSet;

import javax.persistence.EntityManager;

import com.cts.jpa.hib.demo.model.ManyToMany.Artist;
import com.cts.jpa.hib.demo.model.ManyToMany.Movies;
import com.cts.jpa.hib.demo.util.JPAUtil;

public class Example6 {
	
	public static void main(String[] args) {
		
		Movies movie1 = new Movies(1,"kanchana",new TreeSet<Artist>());
		Movies movie2 = new Movies(2,"Sanju",new TreeSet<Artist>());
		
		Artist a1 =new Artist(101,"ranbir Kapoor",new TreeSet<Movies>());
		Artist a2 =new Artist(102,"sonam Kapoor",new TreeSet<Movies>());
		Artist a3 =new Artist(103,"lawerance",new TreeSet<Movies>());
		Artist a4 =new Artist(105,"Oviya",new TreeSet<Movies>());
		
		movie1.getArtist().add(a1);
		movie1.getArtist().add(a2);
		
		movie2.getArtist().add(a3);
		movie2.getArtist().add(a4);
		
		a1.getMovies().add(movie2);
		a2.getMovies().add(movie2);
		a3.getMovies().add(movie1);
		a4.getMovies().add(movie1);
		
		
		EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
		
		em.getTransaction().begin();
		em.persist(movie1);
		em.persist(movie2);
		em.persist(a1);
		em.persist(a2);
		em.persist(a3);
		em.persist(a4);
		em.getTransaction().commit();
		
		System.out.println("Customer Saved !!");
		
		JPAUtil.shutdown();
	}
}
