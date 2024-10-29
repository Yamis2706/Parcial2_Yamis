package co.edu.uniquindio.patrones_disenio.patrones_disenio.patrones;

import co.edu.uniquindio.patrones_disenio.patrones_disenio.patrones.adapter.AutenticacionAdapter;
import co.edu.uniquindio.patrones_disenio.patrones_disenio.patrones.adapter.impl.SistemaAntiguoImpl;
import co.edu.uniquindio.patrones_disenio.patrones_disenio.patrones.adapter.impl.SistemaNuevoMFAImpl;
import co.edu.uniquindio.patrones_disenio.patrones_disenio.patrones.adapter.in.SistemaAntiguo;
import co.edu.uniquindio.patrones_disenio.patrones_disenio.patrones.adapter.in.SistemaNuevoMFA;
import co.edu.uniquindio.patrones_disenio.patrones_disenio.patrones.factory.Producto;
import co.edu.uniquindio.patrones_disenio.patrones_disenio.patrones.factory.ProductoFactory;
import co.edu.uniquindio.patrones_disenio.patrones_disenio.patrones.factory.electrodomesticos.ElectrodomesticoFactory;
import co.edu.uniquindio.patrones_disenio.patrones_disenio.patrones.factory.vehiculos.VehiculoFactory;

public class Main {
    public static void main(String[] args) {
        ProductoFactory vehiculoFactory = new VehiculoFactory();
        Producto coche = vehiculoFactory.crearProducto("coche");
        coche.descripcion();

        ProductoFactory electrodomesticoFactory = new ElectrodomesticoFactory();
        Producto lavadora = electrodomesticoFactory.crearProducto("lavadora");
        lavadora.descripcion();





        SistemaAntiguo sistemaAntiguo = new SistemaAntiguoImpl();
        sistemaAntiguo.autenticar("juan", "contraseña123");

        SistemaNuevoMFA sistemaNuevo = new SistemaNuevoMFAImpl();
        SistemaAntiguo adapter = new AutenticacionAdapter(sistemaNuevo);
        adapter.autenticar("juan", "contraseña123");
    }

}
