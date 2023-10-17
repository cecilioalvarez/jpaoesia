package es.oesia.jpa.relaciones.main1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import es.oesia.jpa.Ejemplar;
import es.oesia.jpa.Prestamo;

public class Principal9c {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("oesia");
		EntityManager em = emf.createEntityManager();
		
		Prestamo prestamo=em.find(Prestamo.class, 1);
	
		
		for (Ejemplar e: prestamo.getEjemplares()) {
			
			System.out.println(e.getCodigo());
		}
		

	}

}
