package es.oesia.jpa.relaciones;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import es.oesia.jpa.Categoria;
import es.oesia.jpa.Libro;

public class Principal5 {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("oesia");
		EntityManager em = emf.createEntityManager();
		// aqui siempre el nombre de la entidad de jpa
		// y luego un alias compacto
		TypedQuery<Categoria> consulta = em.createQuery("select distinct c from Categoria c join fetch c.libros order by c.id", Categoria.class);
		List<Categoria> lista = consulta.getResultList();
		for (Categoria c : lista) {

			System.out.println(c.getId());
			System.out.println(c.getNombre());
			
			System.out.println("*********************");
			
			for (Libro l : c.getLibros())  {
				
				System.out.println(l.getIsbn());
				System.out.println(l.getTitulo());
				
			}
			System.out.println("-----------------------");
			//una relacion de one to many la carga es lazy por defecto
			
		}
		
	}

}
