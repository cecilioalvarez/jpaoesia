package es.oesia.jpa.relaciones;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import es.oesia.jpa.Ejemplar;

public class Principal9 {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("oesia");
		EntityManager em = emf.createEntityManager();
		TypedQuery<Ejemplar> query= em.createQuery("select e from Ejemplar e left join fetch e.libro as l left join fetch  l.categoria", Ejemplar.class);
		List<Ejemplar> lista= query.getResultList();
		
		for (Ejemplar e :lista) {
			
			System.out.println(e.getCodigo());
			System.out.println("*****ejemplar*****");
			System.out.println(e.getLibro().getIsbn());
			System.out.println(e.getLibro().getAutor());
			System.out.println("****libro ejemplar******");
			System.out.println(e.getLibro().getCategoria().getId());
			System.out.println(e.getLibro().getCategoria().getNombre());
			System.out.println("****categoria ejemplar******");
		}
		

	}

}
