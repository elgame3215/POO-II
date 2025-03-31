
public class Empresa {

    private String nombre;
    private String cuit;
    Empleado[] empleados;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public void setEmpleados(Empleado[] empleados) {
        this.empleados = empleados;
    }

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
            retencionesTotales += empleado.retenciones();
        }

        return retencionesTotales;
    }

    public void liquidarSueldos() {
        for (Empleado empleado : empleados) {
            empleado.generarReciboDeHaberes();
        }
    }
}
