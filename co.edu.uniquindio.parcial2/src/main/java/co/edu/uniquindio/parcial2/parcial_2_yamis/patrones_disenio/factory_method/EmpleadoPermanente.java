package co.edu.uniquindio.parcial2.parcial_2_yamis.patrones_disenio.factory_method;

public class EmpleadoPermanente extends Empleado {
    public EmpleadoPermanente(String nombre, double salario) {
        super(nombre, salario);
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Empleado permanente: " + nombre + ", salario: " + salario);
    }
}
