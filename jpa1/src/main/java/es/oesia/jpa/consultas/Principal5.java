package es.oesia.jpa.consultas;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import es.oesia.jpa.Libro;

public class Principal5 {

	public static void main(String[] args) {
		
		
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("oesia");
		EntityManager em= emf.createEntityManager();
		//aqui siempre el nombre de la entidad de jpa
		// y luego un alias compacto
		TypedQuery<String> consulta=
				em.createQuery("select upper(l.autor) "
						+ "from Libro l order by l.autor",String.class);
		List<String> lista=consulta.getResultList();
		for (String l : lista) {
			
			System.out.println(l);
		}
	}

}
