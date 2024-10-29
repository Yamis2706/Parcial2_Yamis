package co.edu.uniquindio.patrones_disenio.patrones_disenio.patrones.factory.electrodomesticos;

import co.edu.uniquindio.patrones_disenio.patrones_disenio.patrones.factory.Producto;

public class Televisor implements Producto {
    @Override
    public void descripcion() {
        System.out.println("Televisor: Para ferias, exposiciones o entretenimiento doméstico.");
    }
}
