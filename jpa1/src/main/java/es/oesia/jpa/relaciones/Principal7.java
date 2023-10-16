package es.oesia.jpa.relaciones;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import es.oesia.jpa.Ejemplar;
import es.oesia.jpa.Libro;

public class Principal7 {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("oesia");
		EntityManager em = emf.createEntityManager();

		
		Libro l = em.find(Libro.class, "1AB");
		Ejemplar e1 = new Ejemplar("AAA");
		l.addEjemplar(e1);
		// se nos olvida que el entity manager no es tan listo
		
		//em.merge(e1);

		em.getTransaction().begin();
		em.merge(l);
		em.getTransaction().commit();

	}

}
