package es.oesia.jpa;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
@Entity
@DiscriminatorValue(value="joven")
public class TarjetaJoven extends Tarjeta {

	public TarjetaJoven() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TarjetaJoven(int numero, Date fecha) {
		super(numero, fecha);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double importeConDescuento(double importe) {
		// TODO Auto-generated method stub
		return importe* 0.97;
	}

}
