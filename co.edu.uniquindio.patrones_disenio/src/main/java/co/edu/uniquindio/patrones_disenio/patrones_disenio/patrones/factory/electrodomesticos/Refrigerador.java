package co.edu.uniquindio.patrones_disenio.patrones_disenio.patrones.factory.electrodomesticos;

import co.edu.uniquindio.patrones_disenio.patrones_disenio.patrones.factory.Producto;

public class Refrigerador implements Producto {
    @Override
    public void descripcion() {
        System.out.println("Refrigerador: Para eventos o uso doméstico temporal");
    }
}

