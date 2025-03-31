
public class EmpleadoContratado extends Empleado {

    private int numeroDeContrato;
    private String medioDePago;

    @Override
    String[] conceptos() {
        String[] conceptos = {
            "retención por gastos administrativos contractuales: " + this.retencionesContractuales()
        };
        return conceptos;
    }

    private double retencionesContractuales() {
        return 50;
    }

    @Override
    double montoPorBonificaciones() {
        return 0;
    }

    @Override
    double retenciones() {
        return this.retencionesContractuales();
    }

}
