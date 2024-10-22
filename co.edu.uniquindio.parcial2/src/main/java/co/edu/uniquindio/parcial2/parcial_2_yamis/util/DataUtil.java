package co.edu.uniquindio.parcial2.parcial_2_yamis.util;

import co.edu.uniquindio.parcial2.parcial_2_yamis.model.Cliente;
import co.edu.uniquindio.parcial2.parcial_2_yamis.model.PrestamoUq;

import java.time.LocalDate;

public class DataUtil {

    public static PrestamoUq inicializarDatos() throws Exception{

        PrestamoUq prestamoUq = new PrestamoUq();

        prestamoUq.crearCliente("Fabián", "Gallego", "103371", "35");
        prestamoUq.crearCliente("Lucía", "Méndez", "109344", "56");
        prestamoUq.crearCliente("Marina", "Sánchez", "104456", "23");
        prestamoUq.crearCliente("Sara", "López", "107210", "30");
        prestamoUq.crearCliente("Sara", "López", "111111", "30");

        prestamoUq.crearEmpleado("José", "Cardona", "180934", "45");
        prestamoUq.crearEmpleado("Felipe", "Cortés", "108734", "28");
        prestamoUq.crearEmpleado("Camila", "Ruíz", "104567", "32");
        prestamoUq.crearEmpleado("Natalia", "Ramírez", "192364", "28");

        prestamoUq.crearObjeto("Monitor","M456");
        prestamoUq.crearObjeto("Teclado","T962");
        prestamoUq.crearObjeto("Proyector","P720");
        prestamoUq.crearObjeto("Cable","C503");
        prestamoUq.crearObjeto("Mouse","M200");
        prestamoUq.crearObjeto("Pantalla Lcd","P350");
        prestamoUq.crearObjeto("USB","U429");
        prestamoUq.crearObjeto("Cargador","C015");

        prestamoUq.crearPrestamo("234", "103371", "192364", "M456",
                LocalDate.of(2024, 10, 11),
                LocalDate.of(2024, 10, 22), "Préstamo de un monitor" );
        prestamoUq.crearPrestamo("621",  "103371", "180934", "M456",
                LocalDate.of(2024, 10, 10),
                LocalDate.of(2024, 10, 20),"Préstamo de un monitor" );
        prestamoUq.crearPrestamo("622",  "103371", "180934", "M456",
                LocalDate.of(2024, 10, 14),
                LocalDate.of(2024, 10, 20),"Préstamo de un monitor" );
        prestamoUq.crearPrestamo("095", "107210", "180934", "T962",
                LocalDate.of(2024, 10, 9),
                LocalDate.of(2024, 10, 12), "Préstamo de un teclado" );
        prestamoUq.crearPrestamo("096", "103371", "108734", "T962",
                LocalDate.of(2024, 10, 8),
                LocalDate.of(2024, 10, 16), "Préstamo de un teclado" );
        prestamoUq.crearPrestamo("097", "103371", "180934", "T962",
                LocalDate.of(2024, 10, 7),
                LocalDate.of(2024, 10, 19), "Préstamo de un teclado" );
        prestamoUq.crearPrestamo("098", "107210", "108734", "T962",
                LocalDate.of(2024, 10, 10),
                LocalDate.of(2024, 10, 15), "Préstamo de un teclado" );
        prestamoUq.crearPrestamo("099", "109344", "180934", "T962",
                LocalDate.of(2024, 10, 19),
                LocalDate.of(2024, 10, 22), "Préstamo de un teclado" );
        prestamoUq.crearPrestamo("598", "103371", "180934", "C503",
                LocalDate.of(2024, 10, 7),
                LocalDate.of(2024, 10, 14), "Préstamo de un cable" );
        prestamoUq.crearPrestamo("033", "104456", "180934", "P720",
                LocalDate.of(2024, 10, 18),
                LocalDate.of(2024, 10, 21), "Préstamo de un proyector" );
        prestamoUq.crearPrestamo("096", "104456", "180934", "P720",
                LocalDate.of(2024, 10, 16),
                LocalDate.of(2024, 10, 22), "Préstamo de un proyector" );
        prestamoUq.crearPrestamo("003", "104456", "192364", "C503",
                LocalDate.of(2024, 10, 3),
                LocalDate.of(2024, 10, 5), "Préstamo de un cable" );
        prestamoUq.crearPrestamo("472", "107210", "104567", "M200",
                LocalDate.of(2024, 10, 12),
                LocalDate.of(2024, 10, 20), "Préstamo de un mouse" );
        prestamoUq.crearPrestamo("309", "103371", "180934", "P350",
                LocalDate.of(2024, 10, 10),
                LocalDate.of(2024, 10, 18), "Préstamo de una pantalla lcd" );
        prestamoUq.crearPrestamo("117", "103371", "180934", "U429",
                LocalDate.of(2024, 10, 5),
                LocalDate.of(2024, 10, 12), "Préstamo de una usb" );
        prestamoUq.crearPrestamo("852", "103371", "180934", "C015",
                LocalDate.of(2024, 10, 2),
                LocalDate.of(2024, 10, 18), "Préstamo de un cargador" );
        prestamoUq.crearPrestamo("511", "111111", "180934", "U429",
                LocalDate.of(2024, 10, 2),
                LocalDate.of(2024, 10, 18), "Préstamo de un cargador" );

        return prestamoUq;
    }
}
