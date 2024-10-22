package co.edu.uniquindio.parcial2.parcial_2_yamis.patrones_disenio;

import co.edu.uniquindio.parcial2.parcial_2_yamis.patrones_disenio.AdaptadorPago;
import co.edu.uniquindio.parcial2.parcial_2_yamis.patrones_disenio.EmpleadoFactory;
import co.edu.uniquindio.parcial2.parcial_2_yamis.patrones_disenio.Vehiculo;
import co.edu.uniquindio.parcial2.parcial_2_yamis.patrones_disenio.adapter.PasarelaPagos;
import co.edu.uniquindio.parcial2.parcial_2_yamis.patrones_disenio.adapter.SistemaPagoHeredado;
import co.edu.uniquindio.parcial2.parcial_2_yamis.patrones_disenio.command.*;
import co.edu.uniquindio.parcial2.parcial_2_yamis.patrones_disenio.factory_method.Empleado;

public class Main {

    public static void main(String[] args) {

        System.out.println("----Factory Method----");
        Empleado empleadoPermanente = EmpleadoFactory.crearEmpleado("permanente",
                "Juan", 3000);
        Empleado empleadoTemporal = EmpleadoFactory.crearEmpleado("temporal",
                "Ana", 1500);
        empleadoPermanente.mostrarDetalles();
        empleadoTemporal.mostrarDetalles();

        System.out.println("----Prototype----");
        Vehiculo vehiculoOriginal = new Vehiculo("Toyota", "Corolla", "Rojo", 15000);
        Vehiculo vehiculoClonado = vehiculoOriginal.clonar();
        vehiculoOriginal.mostrarDetalles();
        vehiculoClonado.mostrarDetalles();

        System.out.println("----Adapter----");
        SistemaPagoHeredado sistemaPagoHeredado = new SistemaPagoHeredado();

        PasarelaPagos pasarelaPagos = new AdaptadorPago(sistemaPagoHeredado);
        pasarelaPagos.pagar(500);

        System.out.println("----Command----");
        Receptor receptor = new Receptor();

        Command entregaLocalCommand = new EntregaLocalCommand(receptor);
        Command entregaNacionalCommand = new EntregaNacionalCommand(receptor);

        Invocador invocador = new Invocador();
        invocador.ejecutar(entregaLocalCommand);
        invocador.ejecutar(entregaNacionalCommand);
    }
}
