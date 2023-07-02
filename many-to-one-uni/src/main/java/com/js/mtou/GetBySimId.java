package com.js.mtou;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class GetBySimId {
	
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("uday");
		EntityManager em = emf.createEntityManager();
		
		Sim s= em.find(Sim.class, 3);
		
		if(s != null) {
			System.out.println("Sim Id = "+s.getId());
			System.out.println("Sim Type = "+s.getType());
			System.out.println("Sim Provider = "+s.getProvider());
			
			System.out.println("==================================");
			
			Mobile m = s.getMobile();
			if(m != null) {
				System.out.println("Mobile Id = "+m.getId());
				System.out.println("Mobile Name = "+m.getName());
				System.out.println("Mobile Brand = "+m.getBrand());
				System.out.println("Mobile Price = "+m.getPrice());
			}else {
				System.out.println("No mobile in the given Id");
			}
		}else {
			System.out.println("No Sim In the Given Id");
		}
		
		
	}

}
