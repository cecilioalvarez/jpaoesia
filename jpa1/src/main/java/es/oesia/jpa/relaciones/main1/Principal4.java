package es.oesia.jpa.relaciones.main1;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import es.oesia.jpa.Libro;

public class Principal4 {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("oesia");
		EntityManager em = emf.createEntityManager();
		// aqui siempre el nombre de la entidad de jpa
		// y luego un alias compacto
		TypedQuery<Libro> consulta = em.createQuery("select l from Libro l  inner join l.categoria c", Libro.class);
		List<Libro> lista = consulta.getResultList();
		for (Libro l : lista) {

			System.out.println(l.getIsbn());
			System.out.println(l.getTitulo());
			System.out.println(l.getAutor());
			System.out.println("--------------");
			
			System.out.println(l.getCategoria().getId());
			System.out.println(l.getCategoria().getNombre());
			System.out.println("************");
		}
		
		// yo tengo 7 filas en la tabla hago un select de la tabla
		// eso es una primera consulta por cada libro se selecciona la categoria
		// por lo tanto tengo 7+1= 8
		// alguien me lo puede decir
		
	}

}
