
import java.util.Date;

public class EmpleadoPlantaTemporaria extends Empleado {

    private Date fechaFinDesignacion;
    private int cantidadHorasExtra;

    public void setFechaFinDesignacion(Date fechaFinDesignacion) {
        this.fechaFinDesignacion = fechaFinDesignacion;
    }

    public void setCantidadHorasExtra(int cantidadHorasExtra) {
        this.cantidadHorasExtra = cantidadHorasExtra;
    }

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
    double retenciones() {
        return retencionesPorAportes() + retencionesPorObraSocial();
    }

    @Override
    protected double montoPorBonificaciones() {
        return montoPorHorasExtra();
    }

    @Override
    protected String[] conceptos() {
        String[] conceptos = {
            "bono por horas extra: " + this.montoPorHorasExtra(),
            "retención por obra social: " + this.retencionesPorObraSocial(),
            "retención por aportes: " + this.retencionesPorAportes()
        };
        return conceptos;
    }

}
