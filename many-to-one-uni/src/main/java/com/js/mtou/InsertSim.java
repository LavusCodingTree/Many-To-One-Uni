package com.js.mtou;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertSim {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("uday");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Sim s = new Sim();

		s.setType("4G");
		s.setProvider("Idea");

		Mobile m = em.find(Mobile.class, 2);

		s.setMobile(m);// to generate the FK

		et.begin();
		em.persist(s);
		et.commit();
	}

}
