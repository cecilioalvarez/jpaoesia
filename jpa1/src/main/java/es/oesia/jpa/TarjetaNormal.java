package es.oesia.jpa;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
@Entity
@DiscriminatorValue(value="normal")
public class TarjetaNormal extends Tarjeta {

	public TarjetaNormal() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TarjetaNormal(int numero, Date fecha) {
		super(numero, fecha);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double importeConDescuento(double importe) {
		// TODO Auto-generated method stub
		return importe;
	}

}
