package ar.edu.unq.poo2.tp2;

import java.util.ArrayList;
import java.util.Date;

abstract class Empleado {

	public Empleado(String nombre, String direccion, String estadoCivil, Date fechaNacimiento, double sueldoBasico) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.estadoCivil = estadoCivil;
		this.fechaNacimiento = fechaNacimiento;
		this.sueldoBasico = sueldoBasico;
		this.recibosDeHaberes = new ArrayList<ReciboDeHaberes>();
	}

	private String nombre;
	private String direccion;
	private String estadoCivil;
	private Date fechaNacimiento;
	private double sueldoBasico;
	private ArrayList<ReciboDeHaberes> recibosDeHaberes;

	public int edad() {
		Date hoy = new Date();
		int añoActual = hoy.getYear() + 1900;
		int añoDeNacimiento = this.fechaNacimiento.getYear();
		return añoActual - añoDeNacimiento;
	}

	public double sueldoBruto() {
		return this.sueldoBasico + this.montoBonificaciones();
	}

	public double sueldoNeto() {
		return this.sueldoBruto() - this.montoRetenciones();
	}

	public void generarReciboDeHaberes() {
		ReciboDeHaberes recibo = new ReciboDeHaberes(nombre, direccion, new Date(), sueldoBruto(), sueldoNeto(),
				desgloceConceptos());

		this.recibosDeHaberes.add(recibo);
	}

	private String desgloceConceptos() {
		String conceptos = "";

		for (String concepto : this.conceptos()) {
			conceptos = conceptos.concat(concepto + "\n");
		}

		return conceptos;
	}

	abstract protected double montoRetenciones();

	abstract protected double montoBonificaciones();

	abstract protected String[] conceptos();

}
