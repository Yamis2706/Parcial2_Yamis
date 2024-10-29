package co.edu.uniquindio.patrones_disenio.patrones_disenio.patrones.factory.vehiculos;

import co.edu.uniquindio.patrones_disenio.patrones_disenio.patrones.factory.Producto;

public class Motocicleta implements Producto {
    @Override
    public void descripcion() {
        System.out.println("Motocicleta: Uso personal o viajes");
    }
}
