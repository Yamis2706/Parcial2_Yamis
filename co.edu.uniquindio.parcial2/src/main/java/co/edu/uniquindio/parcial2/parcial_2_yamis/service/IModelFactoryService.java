package co.edu.uniquindio.parcial2.parcial_2_yamis.service;

import co.edu.uniquindio.parcial2.parcial_2_yamis.factory.dto.ClienteDto;


import java.util.List;

public interface IModelFactoryService {



    void crearCliente(ClienteDto cliente) throws Exception;

    void obtenerCliente(String cedula) throws Exception;

    void actualizarCliente(ClienteDto cliente) throws Exception;

    void eliminarcliente(String cedula) throws Exception;

    List<ClienteDto> listarClientes();

}
