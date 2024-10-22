package co.edu.uniquindio.parcial2.parcial_2_yamis.controller;

import co.edu.uniquindio.parcial2.parcial_2_yamis.factory.ModelFactory;
import co.edu.uniquindio.parcial2.parcial_2_yamis.factory.dto.ClienteDto;
import co.edu.uniquindio.parcial2.parcial_2_yamis.factory.dto.PrestamoDto;

import java.util.List;

public class ClienteController {

    private ModelFactory modelFactory;

    public ClienteController(){
        modelFactory  = ModelFactory.getInstancia();
    }

    public void crearCliente(ClienteDto cliente) throws Exception {
        modelFactory.crearCliente(cliente);
    }

    public void actualizarCliente(ClienteDto cliente) throws Exception{
        modelFactory.actualizarCliente(cliente);
    }

    public void eliminarCliente(String cedula) throws Exception{
        modelFactory.eliminarCliente(cedula);
    }

    public List<ClienteDto> listarClientes() {
        return modelFactory.listarClientes();
    }

    public List<PrestamoDto> listarPrestamos(String cedulaCliente) {
        return modelFactory.listarPrestamos(cedulaCliente);
    }

}