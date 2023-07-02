package com.js.mtou;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateSimById {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("uday");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Sim s = em.find(Sim.class, 3);

		if (s != null) {
			s.setType("5G");
			s.setProvider("JIO");

			Mobile m = s.getMobile();
			if (m != null) {
				m.setName("K20PRO");
				m.setBrand("Redmi");

				et.begin();
				em.merge(s);
				em.merge(m);
				et.commit();
			} else {
				et.begin();
				em.merge(s);
				et.commit();

				System.out.println("No mobile in the given Id");
			}
		} else {
			System.out.println("No Sim In the Given Id");
		}

	}

}
