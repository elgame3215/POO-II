package supermercado;

public class ProductoPrimeraNecesidad extends Producto {
	private double porcentajeDescuento;
	
	public ProductoPrimeraNecesidad(String nombre, double precio, boolean precioCuidado) {
		super(nombre, precio, precioCuidado);
	}
	
	public ProductoPrimeraNecesidad(String nombre, double precio, boolean precioCuidado, double porcentajeDescuento) {
		super(nombre, precio, precioCuidado);
		this.porcentajeDescuento = porcentajeDescuento;
	}
	
	public double getPrecio() {
		return precio - (precio * porcentajeDescuento/100);
	}
}
