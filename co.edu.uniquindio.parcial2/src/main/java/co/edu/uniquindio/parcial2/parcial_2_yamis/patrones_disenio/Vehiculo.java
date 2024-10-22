package co.edu.uniquindio.parcial2.parcial_2_yamis.patrones_disenio;

import co.edu.uniquindio.parcial2.parcial_2_yamis.patrones_disenio.prototype.Clonable;

public class Vehiculo implements Clonable {
    private String marca;
    private String modelo;
    private String color;
    private double precio;

    public Vehiculo(String marca, String modelo, String color, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.precio = precio;
    }

    public void mostrarDetalles() {
        System.out.println("Vehiculo: " + marca + " " + modelo + ", color: " + color + ", precio: " + precio);
    }

    @Override
    public Vehiculo clonar() {
        return new Vehiculo(marca, modelo, color, precio);
    }
}
