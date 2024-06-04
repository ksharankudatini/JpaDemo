package com.appaji.JpaDemo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class App {
	public static void main(String[] args) {
//    System.out.println("Hello World!");
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("appaji");
		EntityManager em = emf.createEntityManager();
//		em.getTransaction().begin();
//		Alien alien = new Alien(1, "appaji", "java");
//		em.persist(alien);
//		em.getTransaction().commit();

//		em.close();
//		emf.close();
	  Alien alien = em.find(Alien.class, 1);
	  System.out.println(alien);
	}
}
