package es.oesia.jpa.relaciones.main1;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import es.oesia.jpa.Categoria;
import es.oesia.jpa.Ejemplar;
import es.oesia.jpa.Libro;

public class Principal10 {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("oesia");
		EntityManager em = emf.createEntityManager();
		TypedQuery<Categoria> query = em.createQuery("select distinct (c) from Categoria c left join fetch c.libros",Categoria.class);
		List<Categoria> lista = query.getResultList();

		for (Categoria c : lista) {
			if (c != null) {
				System.out.println("*****categoria*****");
				System.out.println(c.getId());
				System.out.println(c.getNombre());
				
				
				System.out.println("-------libro-------*");
				for (Libro l: c.getLibros()) {
					System.out.println(l.getTitulo());
					System.out.println(l.getAutor());
					System.out.println("-------------------");
				}
				System.out.println("*******************");
			}
			

		}

	}

}
