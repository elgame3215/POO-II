
import java.util.ArrayList;
import java.util.Date;

abstract class Empleado {

    private String nombre;
    private String direccion;
    private String estadoCivil;
    private Date fechaNacimiento;
    private double sueldoBasico;
    ArrayList<ReciboDeHaberes> recibosDeHaberes;

    public Empleado() {
        this.recibosDeHaberes = new ArrayList<ReciboDeHaberes>();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    public void setRecibosDeHaberes(ArrayList<ReciboDeHaberes> recibosDeHaberes) {
        this.recibosDeHaberes = recibosDeHaberes;
    }

    public int edad() {
        Date hoy = new Date();
        return hoy.getYear() + 1900 - this.fechaNacimiento.getYear();
    }

    public double sueldoBruto() {
        return this.sueldoBasico + this.montoPorBonificaciones();
    }

    public double sueldoNeto() {
        return this.sueldoBruto() - this.retenciones();
    }

    public void generarReciboDeHaberes() {
        ReciboDeHaberes recibo = new ReciboDeHaberes();
        recibo.setNombreEmpleado(this.nombre);
        recibo.setDireccion(this.direccion);
        recibo.setFechaEmision(new Date());
        recibo.setSueldoBruto(this.sueldoBruto());
        recibo.setSueldoNeto(this.sueldoNeto());
        recibo.setDesgloceConceptos(this.desgloceConceptos());
        this.recibosDeHaberes.add(recibo);
    }

    private String desgloceConceptos() {
        String conceptos = "";

        for (String concepto : this.conceptos()) {
            conceptos = conceptos.concat(concepto + "\n");
        }

        return conceptos;
    }

    abstract double retenciones();

    abstract String[] conceptos();

    abstract double montoPorBonificaciones();

}
