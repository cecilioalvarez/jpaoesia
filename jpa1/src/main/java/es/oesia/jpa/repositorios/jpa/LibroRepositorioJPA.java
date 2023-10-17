package es.oesia.jpa.repositorios.jpa;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import es.oesia.jpa.Libro;

public class LibroRepositorioJPA implements LibroRepositorio {

	private EntityManager em;
	
	public LibroRepositorioJPA(EntityManager em) {
		this.em = em;
	}
	public Optional<Libro> buscarUno(String isbn) {
		
		return Optional.ofNullable(em.find(Libro.class, isbn));	
	}

	public List<Libro> buscarTodos() {
		
		return em.createNamedQuery("Libro.buscarTodos",Libro.class).getResultList();
			
	}
	
	public List<Libro> buscarPorAutor(String autor) {
		
		TypedQuery<Libro> query=em.createNamedQuery("Libro.buscarTodosPorAutor",Libro.class);
		query.setParameter("autor", autor);
		return query.getResultList();
			
	}
	
	
	
}
