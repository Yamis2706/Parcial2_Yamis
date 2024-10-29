package co.edu.uniquindio.parcial2.parcial_2_yamis.controller;

import co.edu.uniquindio.parcial2.parcial_2_yamis.factory.ModelFactory;
import co.edu.uniquindio.parcial2.parcial_2_yamis.factory.dto.EmpleadoDto;
import co.edu.uniquindio.parcial2.parcial_2_yamis.factory.dto.PrestamoDto;


import java.util.List;

public class EmpleadoController {

    private ModelFactory modelFactory;

    public EmpleadoController(){
        modelFactory  = ModelFactory.getInstancia();
    }

    public List<EmpleadoDto> listarEmpleados() {
        return modelFactory.listarEmpleados();
    }

    public List<PrestamoDto> listarPrestamos(String cedulaEmpleado) {
        return modelFactory.listarPrestamos(cedulaEmpleado);
    }

}
