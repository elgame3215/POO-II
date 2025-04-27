package supermercado;

public class Producto {
	protected String nombre;
	protected double precio;
	protected boolean precioCuidado = false;

	public Producto(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}

	public Producto(String nombre, double precio, boolean precioCuidado) {
		this.nombre = nombre;
		this.precio = precio;
		this.precioCuidado = precioCuidado;
	}

	public String getNombre() {
		return nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public boolean esPrecioCuidado() {
		return precioCuidado;
	}

	public void aumentarPrecio(double aumento) {
		precio += aumento;
	}
}
