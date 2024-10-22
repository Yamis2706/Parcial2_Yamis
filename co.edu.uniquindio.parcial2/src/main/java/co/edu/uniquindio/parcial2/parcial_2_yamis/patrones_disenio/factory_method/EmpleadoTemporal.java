package co.edu.uniquindio.parcial2.parcial_2_yamis.patrones_disenio.factory_method;

public class EmpleadoTemporal extends Empleado {
    public EmpleadoTemporal(String nombre, double salario) {
        super(nombre, salario);
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Empleado temporal: " + nombre + ", salario: " + salario);
    }
}

