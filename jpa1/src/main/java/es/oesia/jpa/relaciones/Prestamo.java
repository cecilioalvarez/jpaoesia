package es.oesia.jpa.relaciones;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import es.oesia.jpa.Ejemplar;

@Entity
@Table
public class Prestamo {
	@Id
	private int id;
	private Date fecha;
	private List<Ejemplar> ejemplares= new ArrayList<Ejemplar>();
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public List<Ejemplar> getEjemplares() {
		return ejemplares;
	}
	public void setEjemplares(List<Ejemplar> ejemplares) {
		this.ejemplares = ejemplares;
	}



}
