package es.oesia.jpa.consultas;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import es.oesia.jpa.Libro;

public class Principal {

	public static void main(String[] args) {
		
		
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("oesia");
		EntityManager em= emf.createEntityManager();
		//aqui siempre el nombre de la entidad de jpa
		// y luego un alias compacto
		TypedQuery<Libro> consulta=
				em.createQuery("select l from Libro l ",Libro.class);
		List<Libro> lista=consulta.getResultList();
		for (Libro l : lista) {
			
			System.out.println(l.getIsbn());
			System.out.println(l.getTitulo());
			System.out.println(l.getAutor());
		}
	}

}
