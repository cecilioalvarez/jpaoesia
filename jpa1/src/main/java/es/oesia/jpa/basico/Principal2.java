package es.oesia.jpa.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import es.oesia.jpa.Libro;

public class Principal2 {

	public static void main(String[] args) {
		
		
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("oesia");
		EntityManager em= emf.createEntityManager();
		//tienen que estar gestionadas por jpa
		//tienen que ser clases anotadas por JPA
		// que quieres enfocar por un interface
		//usar alguna clase abstracta hasta que punto lo permitiria
		//porque es un find de un elemento
		
		// unas anotaciones una @discriminator y otra es la de mappedsupperclass
		
		// una entidad managed o gestionado por JPA
		Libro libro=em.find(Libro.class, "1");
		libro.setTitulo("java2");
		libro.setTitulo("java");
		em.getTransaction().begin();
		em.merge(libro);
		em.getTransaction().commit();
		em.close();
		
		// las entidades pasan a estar detached

	}

}
