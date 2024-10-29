package co.edu.uniquindio.patrones_disenio.patrones_disenio.patrones.factory.vehiculos;

import co.edu.uniquindio.patrones_disenio.patrones_disenio.patrones.factory.Producto;

public class Carro implements Producto {
    @Override
    public void descripcion() {
        System.out.println("Carro: Uso personal o viajes");
    }
}
