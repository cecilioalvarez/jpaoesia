package es.oesia.jpa;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "prestamos")
public class Prestamo {
	@Id
	private int id;
	private Date fecha;

	@ManyToMany
	@JoinTable(name = "EjemplaresPrestamo", joinColumns = @JoinColumn(name = "id", nullable = false), inverseJoinColumns = @JoinColumn(name = "isbn", nullable = false))
	private List<Ejemplar> ejemplares = new ArrayList<Ejemplar>();

	public int getId() {
		return id;
	}

	public Prestamo(int id, Date fecha) {
		super();
		this.id = id;
		this.fecha = fecha;
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

	public Prestamo() {
		super();
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Prestamo other = (Prestamo) obj;
		return id == other.id;
	}

	public void addEjemplar(Ejemplar e) {

		ejemplares.add(e);

	}

	public void removeEjemplar(Ejemplar e) {

		ejemplares.remove(e);

	}

}
