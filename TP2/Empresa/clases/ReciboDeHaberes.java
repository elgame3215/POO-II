
import java.util.Date;

public class ReciboDeHaberes {

    private String nombreEmpleado;
    private String direccion;
    private Date fechaEmision;
    private double sueldoBruto;
    private double sueldoNeto;
    String desgloceConceptos;

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public void setSueldoBruto(double sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }

    public void setSueldoNeto(double sueldoNeto) {
        this.sueldoNeto = sueldoNeto;
    }

    public void setDesgloceConceptos(String desgloceConceptos) {
        this.desgloceConceptos = desgloceConceptos;
    }
}
