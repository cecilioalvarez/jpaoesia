package es.oesia.jpa;

import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="socios")
public class Socio {
	@Id
	private String dni;
	private String nombre;
	private String apellidos;
	
	@OneToOne(mappedBy="socio" ,cascade = CascadeType.ALL ,fetch = FetchType.LAZY)
	private Tarjeta tarjeta;
	
	
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public Tarjeta getTarjeta() {
		return tarjeta;
	}
	public void setTarjeta(Tarjeta tarjeta) {
		this.tarjeta = tarjeta;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApelllidos() {
		return apellidos;
	}
	public void setApelllidos(String apelllidos) {
		this.apellidos = apelllidos;
	}
	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Socio other = (Socio) obj;
		return Objects.equals(dni, other.dni);
	}
	@Override
	public String toString() {
		return "Socio [nombre=" + nombre + ", apellidos=" + apellidos + "]";
	}
	
	
}
