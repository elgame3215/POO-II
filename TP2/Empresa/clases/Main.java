
import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        EmpleadoPlantaPermanente empleado1 = new EmpleadoPlantaPermanente();
        empleado1.setNombre("pepe");
        empleado1.setDireccion("Calchaqui 1822");
        empleado1.setEstadoCivil("soltero");
        empleado1.setFechaNacimiento(new Date(1998, 3, 6));
        empleado1.setSueldoBasico(500000);
        empleado1.setCantidadHijos(0);
        empleado1.setAñosAntiguedad(4);
        empleado1.setTieneConyuge(true);

        EmpleadoPlantaPermanente empleado2 = new EmpleadoPlantaPermanente();
        empleado2.setNombre("juan");
        empleado2.setDireccion("Esquel 2100");
        empleado2.setEstadoCivil("soltero");
        empleado2.setFechaNacimiento(new Date(1980, 5, 22));
        empleado2.setSueldoBasico(700000);
        empleado2.setCantidadHijos(3);
        empleado2.setAñosAntiguedad(10);
        empleado2.setTieneConyuge(false);

        EmpleadoPlantaTemporaria empleado3 = new EmpleadoPlantaTemporaria();
        empleado3.setNombre("mati");
        empleado3.setDireccion("Moreno 905");
        empleado3.setEstadoCivil("casado");
        empleado3.setFechaNacimiento(new Date(1984, 1, 20));
        empleado3.setSueldoBasico(950000);
        empleado3.setCantidadHorasExtra(12);
        empleado3.setFechaFinDesignacion(new Date(2026, 6, 30));

        EmpleadoPlantaTemporaria empleado4 = new EmpleadoPlantaTemporaria();
        empleado4.setNombre("seba");
        empleado4.setDireccion("Tucuman 2433");
        empleado4.setEstadoCivil("soltero");
        empleado4.setFechaNacimiento(new Date(2000, 10, 8));
        empleado4.setSueldoBasico(530000);
        empleado4.setCantidadHorasExtra(6);
        empleado4.setFechaFinDesignacion(new Date(2027, 1, 15));

        Empleado[] empleados = {empleado1, empleado2, empleado3, empleado4};

        Empresa empresa = new Empresa();
        empresa.setNombre("Mercado Libre");
        empresa.setCuit("7219489");
        empresa.setEmpleados(empleados);

        ArrayList<ReciboDeHaberes> recibos = new ArrayList<>();

        empresa.liquidarSueldos();
        for (int i = 0; i < 3; i++) {
            Empleado empleado = empresa.empleados[i];
            recibos.add(empleado.recibosDeHaberes.get(0));
        }

        System.out.println(empresa.retencionesTotales());
    }
}
