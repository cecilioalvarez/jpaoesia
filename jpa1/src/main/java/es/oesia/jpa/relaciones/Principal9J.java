package es.oesia.jpa.relaciones;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import es.oesia.jpa.Libro;

public class Principal9J {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("oesia");
		EntityManager em = emf.createEntityManager();

		// creo el builder es el constructor de la consulta
		// que es el constructor de todas sus partes 
		
		CriteriaBuilder cb = em.getCriteriaBuilder();
		// crea una query
		CriteriaQuery<Libro> cq = cb.createQuery(Libro.class);
		Root<Libro> fromLibros = cq.from(Libro.class);
		cq.select(fromLibros);

		//usar el builder para generar restricciones a la consulta
		Predicate predicateAutorCecilio=cb.equal(fromLibros.get("autor"), "cecilio");
		Predicate predicateTituloJava=cb.equal(fromLibros.get("titulo"), "Java");
		Predicate predicateCompuesto=cb.and(predicateAutorCecilio,predicateTituloJava);	
		
		cq.select(fromLibros).where(predicateCompuesto);
		
		List<Libro> lista=em.createQuery(cq).getResultList();
		lista.forEach(System.out::println);
	}

}
