package ar.edu.unq.poo2.tp5;

public class Producto {
	protected double precio;
	protected int stock;
	
	public Producto(double precio) {
		this.precio = precio;
	}

	public double getPrecio() {
		return precio;
	}
}
