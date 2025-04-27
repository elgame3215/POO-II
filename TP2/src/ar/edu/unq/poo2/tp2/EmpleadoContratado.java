package ar.edu.unq.poo2.tp2;

import java.util.Date;

public class EmpleadoContratado extends Empleado {

	public EmpleadoContratado(String nombre, String direccion, String estadoCivil, Date fechaNacimiento,
			double sueldoBasico, int numeroDeContrato, String medioDePago) {
		super(nombre, direccion, estadoCivil, fechaNacimiento, sueldoBasico);
		this.numeroDeContrato = numeroDeContrato;
		this.medioDePago = medioDePago;
	}

	private int numeroDeContrato;
	private String medioDePago;

	private double retencionesContractuales() {
		return 50;
	}

	@Override
	protected String[] conceptos() {
		String[] conceptos = {
				"retención por gastos administrativos contractuales: " + this.retencionesContractuales() };
		return conceptos;
	}

	@Override
	protected double montoBonificaciones() {
		return 0;
	}

	@Override
	protected double montoRetenciones() {
		return this.retencionesContractuales();
	}

}
