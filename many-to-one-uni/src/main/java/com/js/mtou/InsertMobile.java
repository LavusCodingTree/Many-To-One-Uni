package com.js.mtou;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertMobile {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("uday");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Mobile m = new Mobile();
		m.setName("S6");
		m.setBrand("Samsung");
		m.setPrice(35000);
		
		et.begin();
		em.persist(m);
		et.commit();

	}
}
