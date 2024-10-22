package co.edu.uniquindio.parcial2.parcial_2_yamis.patrones_disenio;

import co.edu.uniquindio.parcial2.parcial_2_yamis.patrones_disenio.factory_method.Empleado;
import co.edu.uniquindio.parcial2.parcial_2_yamis.patrones_disenio.factory_method.EmpleadoPermanente;
import co.edu.uniquindio.parcial2.parcial_2_yamis.patrones_disenio.factory_method.EmpleadoTemporal;

public class EmpleadoFactory {
    public static Empleado crearEmpleado(String tipo, String nombre, double salario) {
        if (tipo.equalsIgnoreCase("permanente")) {
            return new EmpleadoPermanente(nombre, salario);
        } else if (tipo.equalsIgnoreCase("temporal")) {
            return new EmpleadoTemporal(nombre, salario);
        }
        return null;
    }
}
