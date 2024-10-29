package co.edu.uniquindio.patrones_disenio.patrones_disenio.patrones.factory.electrodomesticos;

import co.edu.uniquindio.patrones_disenio.patrones_disenio.patrones.factory.Producto;
import co.edu.uniquindio.patrones_disenio.patrones_disenio.patrones.factory.ProductoFactory;

public class ElectrodomesticoFactory extends ProductoFactory {
    @Override
    public Producto crearProducto(String tipo) {
        switch (tipo.toLowerCase()) {
            case "refrigerador":
                return new Refrigerador();
            case "televisor":
                return new Televisor();
            case "lavadora":
                return new Lavadora();
            default:
                throw new IllegalArgumentException("Tipo de electrodoméstico no soportado.");
        }
    }
}
