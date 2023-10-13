package es.oesia.jpa.repositorios;

import javax.persistence.EntityManager;

import es.oesia.jpa.Libro;

public class LibroRepositorio {

	private EntityManager em;
	
	
	
	
	public LibroRepositorio(EntityManager em) {
		super();
		this.em = em;
	}

	public Libro buscarUno(String isbn) {
		
		return em.find(Libro.class, isbn);
			
	}
	
	
}
