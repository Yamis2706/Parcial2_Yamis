package co.edu.uniquindio.parcial2.parcial_2_yamis.controller;

import co.edu.uniquindio.parcial2.parcial_2_yamis.factory.ModelFactory;
import co.edu.uniquindio.parcial2.parcial_2_yamis.factory.dto.ClienteDto;
import co.edu.uniquindio.parcial2.parcial_2_yamis.factory.dto.ObjetoDto;

import java.util.List;

public class InicioController {

    private ModelFactory modelFactory = ModelFactory.getInstancia();

    public ObjetoDto mostrarInformacionObjeto(String id){
        return modelFactory.mostrarInformacionObjeto(id);
    }

    public List<ObjetoDto> obtenerObjetosMasPrestados(int rango){
        return modelFactory.obtenerObjetosMasPrestados(rango);
    }

    public List<ObjetoDto> obtenerObjetosMenosPrestados(int rango){
        return modelFactory.obtenerObjetosMenosPrestados(rango);
    }

    public List<ClienteDto> obtenerClientesMasPrestamos(int rango){
        return modelFactory.obtenerClientesMasPrestamos(rango);
    }

    public List<ClienteDto> obtenerClientesMenosPrestamos(int rango){
        return modelFactory.obtenerClientesMenosPrestamos(rango);
    }

}
