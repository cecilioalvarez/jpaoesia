package es.oesia.jpa;

import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name="personas")
public class Persona extends BaseEntity {

	private String nombre;
	private String apellidos;
	
	public Persona() {
		super();
	}
	public Persona(String nombre, String apellidos) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	
}
