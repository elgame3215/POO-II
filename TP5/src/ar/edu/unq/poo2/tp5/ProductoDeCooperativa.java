package ar.edu.unq.poo2.tp5;

public class ProductoDeCooperativa extends Producto {

	public ProductoDeCooperativa(double precio) {
		super(precio);
	}
	
	public double getPrecio() {
		return precio * .9;
	}

}
