package co.edu.uniquindio.patrones_disenio.patrones_disenio.patrones.factory.vehiculos;

import co.edu.uniquindio.patrones_disenio.patrones_disenio.patrones.factory.Producto;
import co.edu.uniquindio.patrones_disenio.patrones_disenio.patrones.factory.ProductoFactory;

public class VehiculoFactory extends ProductoFactory {
    @Override
    public Producto crearProducto(String tipo) {
        switch (tipo.toLowerCase()) {
            case "coche":
                return new Carro();
            case "motocicleta":
                return new Motocicleta();
            case "bicicleta":
                return new Bicicleta();
            default:
                throw new IllegalArgumentException("Tipo de vehículo no soportado.");
        }
    }
}
