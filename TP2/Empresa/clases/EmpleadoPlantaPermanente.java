
public class EmpleadoPlantaPermanente extends Empleado {

    private int cantidadHijos;
    private int añosAntiguedad;
    private boolean tieneConyuge;

    public void setCantidadHijos(int cantidadHijos) {
        this.cantidadHijos = cantidadHijos;
    }

    public void setAñosAntiguedad(int añosAntiguedad) {
        this.añosAntiguedad = añosAntiguedad;
    }

    public void setTieneConyuge(boolean tieneConyuge) {
        this.tieneConyuge = tieneConyuge;
    }

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
    double retenciones() {
        return retencionesPorAportes() + retencionesPorObraSocial();
    }

    @Override
    protected double montoPorBonificaciones() {
        return montoPorAsignacionPorHijos()
                + montoPorAsignacionPorConyuge()
                + montoBonoPorAntiguedad();
    }

    @Override
    protected String[] conceptos() {
        String[] conceptos = {
            "bono por antigüedad: " + this.montoBonoPorAntiguedad(),
            "bono por cónyuge: " + this.montoPorAsignacionPorConyuge(),
            "bono por asignación por hijo: " + this.montoPorAsignacionPorHijos(),
            "retención por obra social: " + this.retencionesPorObraSocial(),
            "retención por aportes: " + this.retencionesPorAportes()
        };
        return conceptos;
    }

}
