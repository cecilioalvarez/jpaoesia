package es.oesia.jpa.basico;

import javax.persistence.Persistence;

public class Principal6 {

	
	public static void main(String[] args) {
		
		
		Persistence.generateSchema("oesia", null);
	}
}
