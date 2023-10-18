package es.oesia.jpa.relaciones.main2;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import es.oesia.jpa.Tarjeta;

public class Principal4 {

	public static void main(String[] args) {
	
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("oesia");
		EntityManager em = emf.createEntityManager();

		TypedQuery<Tarjeta> consulta= em.createQuery("select t from Tarjeta t",Tarjeta.class);
	
		List<Tarjeta> lista=consulta.getResultList();
		
		for (Tarjeta t : lista) {
			
			
			System.out.println(t.getNumero());
			System.out.println(t.getFecha());
			System.out.println(t.importeConDescuento(100));
		}
	}

}
