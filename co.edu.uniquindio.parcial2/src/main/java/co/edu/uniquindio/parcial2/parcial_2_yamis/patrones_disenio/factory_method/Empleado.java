package co.edu.uniquindio.parcial2.parcial_2_yamis.patrones_disenio.factory_method;

public abstract class Empleado {
    protected String nombre;
    protected double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public abstract void mostrarDetalles();
}
