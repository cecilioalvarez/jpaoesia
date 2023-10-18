package es.oesia.jpa.relaciones.main2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import es.oesia.jpa.BaseEntity;
import es.oesia.jpa.Persona;

public class Principal7 {

	public static void main(String[] args) {
	
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("oesia");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		BaseEntity p= new Persona("david2","gomez");
		BaseEntity p1= new Persona("marta2","perez");
		BaseEntity p3= new Persona("ana2","perez");
		em.persist(p);
		em.persist(p1);
		em.persist(p3);
		em.getTransaction().commit();
	}

}
