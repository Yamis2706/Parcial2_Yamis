package co.edu.uniquindio.parcial2.parcial_2_yamis.factory;

import co.edu.uniquindio.parcial2.parcial_2_yamis.factory.dto.ClienteDto;
import co.edu.uniquindio.parcial2.parcial_2_yamis.factory.dto.ObjetoDto;
import co.edu.uniquindio.parcial2.parcial_2_yamis.factory.dto.PrestamoDto;
import co.edu.uniquindio.parcial2.parcial_2_yamis.model.Cliente;
import co.edu.uniquindio.parcial2.parcial_2_yamis.model.Objeto;
import co.edu.uniquindio.parcial2.parcial_2_yamis.model.PrestamoUq;
import co.edu.uniquindio.parcial2.parcial_2_yamis.util.DataUtil;

import java.util.List;

public class ModelFactory {


    private static ModelFactory modelFactory;
    private PrestamoUq prestamoUq;


    public static ModelFactory getInstancia() {
        if(modelFactory == null) {
            modelFactory = new ModelFactory();
        }
        return modelFactory;
    }

    private ModelFactory(){
        try {
            prestamoUq = DataUtil.inicializarDatos();
        }catch (Exception e){
            e.printStackTrace();
        }
    }


    public void crearCliente(ClienteDto cliente) throws Exception{
        prestamoUq.crearCliente();
    }


    public void actualizarCliente(ClienteDto cliente) throws Exception{
        prestamoUq.actualizarCliente();
    }


    public void eliminarCliente(String cedula) throws Exception{
        prestamoUq.eliminarCliente(cedula);
    }


    public void obtenerCliente(String cedula) throws Exception{
        prestamoUq.obtenerCliente(cedula);
    }


    public List<ClienteDto> listarClientes() {
        return listarClientes();
    }

    public ObjetoDto mostrarInformacionObjeto(String id){
        Objeto objeto = prestamoUq.mostrarInformacionObjeto(id);
        if(objeto == null){
            return null;
        }else{
            return new ObjetoDto(
                    objeto.getId(), objeto.getNombre(),
                    ""+objeto.getVecesPrestado(),
                    prestamoUq.estaDisponible(objeto.getId())
            );
        }
    }

    public List<ObjetoDto> obtenerObjetosMasPrestados(int rango){
        return prestamoUq.obtenerObjetosMasPrestados(rango).stream().map(
                ob -> new ObjetoDto(ob.getId(), ob.getNombre(),
                        ""+ob.getVecesPrestado(),
                        prestamoUq.estaDisponible(ob.getId()))
        ).toList();
    }


    public List<ObjetoDto> obtenerObjetosMenosPrestados(int rango){
        return prestamoUq.obtenerObjetosMenosPrestados(rango).stream().map(
                ob -> new ObjetoDto(ob.getId(), ob.getNombre(),
                        ""+ob.getVecesPrestado(),
                        prestamoUq.estaDisponible(ob.getId()))
        ).toList();
    }

    public List<ClienteDto> obtenerClientesMasPrestamos(int rango) {
        return prestamoUq.obtenerClientesMasPrestamos(rango).stream().map(
                cl -> new ClienteDto(cl.getNombre(), cl.getApellido(),
                        cl.getCedula(),
                        cl.getEdad())
        ).toList();
    }

    public List<ClienteDto> obtenerClientesMenosPrestamos(int rango) {
        return prestamoUq.obtenerClientesMenosPrestamos(rango).stream().map(
                cl -> new ClienteDto(cl.getNombre(), cl.getApellido(),
                        cl.getCedula(),
                        cl.getEdad())
        ).toList();
    }

    public List<PrestamoDto> listarPrestamos(String cedulaCliente) {
        return prestamoUq.listarPrestamosCliente(cedulaCliente).stream().map(
                pr -> new PrestamoDto(
                        pr.getNumeroPrestamo(),
                        pr.getObjeto().getId(),
                        pr.getObjeto().getNombre(),
                        pr.getFechaPrestamo().toString(),
                        pr.getFechaEntrega().toString(),
                        ""+pr.getObjeto().getVecesPrestado()
                )
        ).toList();
    }

}
