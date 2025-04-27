package ar.edu.unq.poo2.tp2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		EmpleadoPlantaPermanente empleado1 = new EmpleadoPlantaPermanente("pepita", "calle 1", "soltero",
				new Date(1998, 3, 6), 500000, 0, 4, true);

		EmpleadoPlantaPermanente empleado2 = new EmpleadoPlantaPermanente("pepe", "calle 2", "casado",
				new Date(1988, 6, 21), 700000, 2, 7, true);

		EmpleadoPlantaTemporaria empleado3 = new EmpleadoPlantaTemporaria("pepon", "calle 3", "soltero",
				new Date(2001, 7, 11), 400000, new Date(2026, 1, 6), 2);

		EmpleadoPlantaTemporaria empleado4 = new EmpleadoPlantaTemporaria("mateo", "calle 4", "casado",
				new Date(1978, 6, 29), 800000, new Date(2028, 15, 12), 5);

		EmpleadoContratado empleado5 = new EmpleadoContratado("alan", "calle 5", "soltero", new Date(1990, 5, 21),
				640000, 912, "transferencia");

		EmpleadoContratado empleado6 = new EmpleadoContratado("lucas", "calle 13", "casado", new Date(1999, 11, 30),
				600000, 2018, "efectivo");

		Empleado[] empleados = { empleado1, empleado2, empleado3, empleado4, empleado5, empleado6 };

		Empresa empresa = new Empresa("Mercado Libre", "1849288492", empleados);

		List<ReciboDeHaberes> recibos = new ArrayList<>();

		empresa.liquidarSueldos();
//		for (int i = 0; i < 3; i++) {
//			Empleado empleado = empresa.empleados[i];
//			recibos.add(empleado.recibosDeHaberes.get(0));
//		}

		System.out.println(empresa.retencionesTotales());
	}
}
