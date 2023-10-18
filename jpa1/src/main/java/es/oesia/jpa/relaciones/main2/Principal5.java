package es.oesia.jpa.relaciones.main2;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import es.oesia.jpa.Tarjeta;
import es.oesia.jpa.TarjetaJubilado;

public class Principal5 {

	public static void main(String[] args) {
	
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("oesia");
		EntityManager em = emf.createEntityManager();

		TypedQuery<TarjetaJubilado> consulta= 
				em.createQuery("select t from TarjetaJubilado as t",TarjetaJubilado.class);
	
		List<TarjetaJubilado> lista=consulta.getResultList();
		
		for (TarjetaJubilado t : lista) {
			
			
			System.out.println(t.getNumero());
			System.out.println(t.getFecha());
			System.out.println(t.importeConDescuento(100));
			System.out.println(t.jubiladoSenior());
		}
	}

}
