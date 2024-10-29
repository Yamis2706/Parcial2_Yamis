package co.edu.uniquindio.patrones_disenio.patrones_disenio.patrones.factory.electrodomesticos;

import co.edu.uniquindio.patrones_disenio.patrones_disenio.patrones.factory.Producto;

public class Lavadora implements Producto {
    @Override
    public void descripcion() {
        System.out.println("Lavadora: Principalmente para clientes en rentas de vivienda a largo plazo.");
    }
}
