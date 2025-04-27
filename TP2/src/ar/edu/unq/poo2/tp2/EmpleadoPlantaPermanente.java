package ar.edu.unq.poo2.tp2;

import java.util.Date;

public class EmpleadoPlantaPermanente extends Empleado {

	public EmpleadoPlantaPermanente(String nombre, String direccion, String estadoCivil, Date fechaNacimiento,
			double sueldoBasico, int cantidadHijos, int añosAntiguedad, boolean tieneConyuge) {
		super(nombre, direccion, estadoCivil, fechaNacimiento, sueldoBasico);
		this.cantidadHijos = cantidadHijos;
		this.añosAntiguedad = añosAntiguedad;
		this.tieneConyuge = tieneConyuge;
	}

	private int cantidadHijos;
	private int añosAntiguedad;
	private boolean tieneConyuge;

	private int montoBonoPorAntiguedad() {
		return this.añosAntiguedad * 50;
	}

	private int montoPorAsignacionPorConyuge() {
		return this.tieneConyuge ? 100 : 0;
	}

	private int montoPorAsignacionPorHijos() {
		return this.cantidadHijos * 150;
	}

	private double retencionesPorAportes() {
		return this.sueldoBruto() * 0.15;
	}

	private double retencionesPorObraSocial() {
		return this.sueldoBruto() * .10 + this.cantidadHijos * 20;
	}

	@Override
	protected double montoRetenciones() {
		return retencionesPorAportes() + retencionesPorObraSocial();
	}

	@Override
	protected double montoBonificaciones() {
		return montoPorAsignacionPorHijos() + montoPorAsignacionPorConyuge() + montoBonoPorAntiguedad();
	}

	@Override
	protected String[] conceptos() {
		String[] conceptos = { "bono por antigüedad: " + this.montoBonoPorAntiguedad(),
				"bono por cónyuge: " + this.montoPorAsignacionPorConyuge(),
				"bono por asignación por hijo: " + this.montoPorAsignacionPorHijos(),
				"retención por obra social: " + this.retencionesPorObraSocial(),
				"retención por aportes: " + this.retencionesPorAportes() };
		return conceptos;
	}

}
