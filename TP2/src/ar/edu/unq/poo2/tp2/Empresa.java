package ar.edu.unq.poo2.tp2;

public class Empresa {

	public Empresa(String nombre, String cuit, Empleado[] empleados) {
		this.nombre = nombre;
		this.cuit = cuit;
		this.empleados = empleados;
	}

	private String nombre;
	private String cuit;
	Empleado[] empleados;

	public double montoTotalSueldosNetos() {
		double montoTotal = 0;
		for (Empleado empleado : empleados) {
			montoTotal += empleado.sueldoNeto();
		}

		return montoTotal;
	}

	public double montoTotalSueldosBrutos() {
		double montoTotal = 0;

		for (Empleado empleado : empleados) {
			montoTotal += empleado.sueldoBruto();
		}

		return montoTotal;
	}

	public double retencionesTotales() {
		double retencionesTotales = 0;

		for (Empleado empleado : empleados) {
			retencionesTotales += empleado.montoRetenciones();
		}

		return retencionesTotales;
	}

	public void liquidarSueldos() {
		for (Empleado empleado : empleados) {
			empleado.generarReciboDeHaberes();
		}
	}
}
