package ar.edu.unq.poo2.tp2;

import java.util.Date;

public class ReciboDeHaberes {

	public ReciboDeHaberes(String nombreEmpleado, String direccion, Date fechaEmision, double sueldoBruto,
			double sueldoNeto, String desgloceConceptos) {
		this.nombreEmpleado = nombreEmpleado;
		this.direccion = direccion;
		this.fechaEmision = fechaEmision;
		this.sueldoBruto = sueldoBruto;
		this.sueldoNeto = sueldoNeto;
		this.desgloceConceptos = desgloceConceptos;
	}

	private String nombreEmpleado;
	private String direccion;
	private Date fechaEmision;
	private double sueldoBruto;
	private double sueldoNeto;
	private String desgloceConceptos;

}
