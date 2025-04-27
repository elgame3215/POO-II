package ar.edu.unq.poo2.tp2;

import java.util.Date;

public class EmpleadoPlantaTemporaria extends Empleado {

	public EmpleadoPlantaTemporaria(String nombre, String direccion, String estadoCivil, Date fechaNacimiento,
			double sueldoBasico, Date fechaFinDesignacion, int cantidadHorasExtra) {
		super(nombre, direccion, estadoCivil, fechaNacimiento, sueldoBasico);
		this.fechaFinDesignacion = fechaFinDesignacion;
		this.cantidadHorasExtra = cantidadHorasExtra;
	}

	private Date fechaFinDesignacion;
	private int cantidadHorasExtra;

	private int retencionPorHorasExtra() {
		return this.cantidadHorasExtra * 5;
	}

	private int montoPorHorasExtra() {
		return this.cantidadHorasExtra * 40;
	}

	private double retencionesPorAportes() {
		return this.sueldoBruto() * .10 + retencionPorHorasExtra();
	}

	private double retencionesPorObraSocial() {
		return this.sueldoBruto() * .10 + retencionPorEdad();
	}

	private int retencionPorEdad() {
		return this.edad() < 25 ? 25 : 0;
	}

	@Override
	protected double montoRetenciones() {
		return retencionesPorAportes() + retencionesPorObraSocial();
	}

	@Override
	protected double montoBonificaciones() {
		return montoPorHorasExtra();
	}

	@Override
	protected String[] conceptos() {
		String[] conceptos = { "bono por horas extra: " + this.montoPorHorasExtra(),
				"retención por obra social: " + this.retencionesPorObraSocial(),
				"retención por aportes: " + this.retencionesPorAportes() };
		return conceptos;
	}

}
