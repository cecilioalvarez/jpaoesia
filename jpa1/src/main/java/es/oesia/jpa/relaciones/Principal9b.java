package es.oesia.jpa.relaciones;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import es.oesia.jpa.Ejemplar;
import es.oesia.jpa.Prestamo;

public class Principal9b {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("oesia");
		EntityManager em = emf.createEntityManager();
		
		Prestamo prestamo=em.find(Prestamo.class, 1);
		Ejemplar ejemplar= em.find(Ejemplar.class, "123");
		
		prestamo.addEjemplar(ejemplar);
		
		
		em.getTransaction().begin();
		em.merge(ejemplar);
		em.merge(prestamo);
		em.getTransaction().commit();
		

	}

}
