package ar.edu.unq.poo2.tp5;

import java.util.ArrayList;
import java.util.List;

public class Caja implements Agencia {
	private List<Producto> productos = new ArrayList<Producto>();

	public double precioTotal() {
		double precioTotal = 0;

		for (Producto producto : productos) {
			precioTotal += producto.getPrecio();
		}
		
		return precioTotal;
	}

	public void agregarProducto(Producto producto) {
		productos.add(producto);
	}

	@Override
	public void registrarPago(Factura factura) {
		
	}
}
