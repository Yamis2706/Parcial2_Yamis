package co.edu.uniquindio.parcial2.parcial_2_yamis.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PrestamoUq {
    private String nombre;

    List<Cliente> listaClientes = new ArrayList<>();
    List<Empleado> listaEmpleados = new ArrayList<>();
    List<Objeto> listaObjetos = new ArrayList<>();
    List<Prestamo> listaPrestamos = new ArrayList<>();

    public PrestamoUq() {
    }

    public PrestamoUq(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(List<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public List<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(List<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public List<Objeto> getListaObjetos() {
        return listaObjetos;
    }

    public void setListaObjetos(List<Objeto> listaObjetos) {
        this.listaObjetos = listaObjetos;
    }

    public List<Prestamo> getListaPrestamos() {
        return listaPrestamos;
    }

    public void setListaPrestamos(List<Prestamo> listaPrestamos) {
        this.listaPrestamos = listaPrestamos;
    }

    public void crearCliente(String nombre, String apellido, String cedula,
                             String edad){
        int resultadoBusqueda = devolverPosicionCliente(cedula);
        if (resultadoBusqueda == -1){
            Cliente cliente = new Cliente();
            cliente.setNombre(nombre);
            cliente.setApellido(apellido);
            cliente.setCedula(cedula);
            cliente.setEdad(edad);
            getListaClientes().add(cliente);
            System.out.println("Ciente creado exitosamente");

        }else {
            System.out.println("El cliente ya está creado en el sistema");
        }
    }


    public void crearEmpleado(String nombre, String apellido, String cedula,
                              String edad){

        int resultadoBusqueda = devolverPosicionEmpleado(cedula);
        if (resultadoBusqueda == -1){
            Empleado empleado = new Empleado();
            empleado.setNombre(nombre);
            empleado.setApellido(apellido);
            empleado.setCedula(cedula);
            empleado.setEdad(edad);
            getListaEmpleados().add(empleado);
            System.out.println("Empleado creado exitosamente");

        }else {
            System.out.println("El empleado ya está creado en el sistema");
        }
    }


    public void crearObjeto(String nombre, String id){

        int resultadoBusqueda = devolverPosicionObjeto(id);
        if (resultadoBusqueda == -1){
            Objeto objeto = new Objeto();
            objeto.setId(id);
            objeto.setNombre(nombre);
            getListaObjetos().add(objeto);
            System.out.println("Objeto creado exitosamente");

        }else {
            System.out.println("El objeto ya está creado en el sistema");
        }
    }


    public void crearPrestamo(String numeroPrestamo,
                              String cedulaCliente,
                              String cedulaEmpleado,
                              String idObjeto, LocalDate fechaPrestamo,
                              LocalDate fechaentrega, String descripcion){
        int resultadoBusqueda = devolverPosicionPrestamo(numeroPrestamo);
        if (resultadoBusqueda == -1){

            Objeto objeto = mostrarObjeto(idObjeto);
            objeto.setVecesPrestado( objeto.getVecesPrestado() + 1 );

            Prestamo prestamo = new Prestamo();
            prestamo.setCliente(mostrarCliente(cedulaCliente));
            prestamo.setObjeto(objeto);
            prestamo.setEmpleado(mostrarEmpleado(cedulaEmpleado));
            prestamo.setNumeroPrestamo(numeroPrestamo);
            prestamo.setFechaPrestamo(fechaPrestamo);
            prestamo.setFechaEntrega(fechaentrega);
            prestamo.setDescripcion(descripcion);
            getListaPrestamos().add(prestamo);
            System.out.println("Préstamo creado exitosamente");

        }else {
            System.out.println("El préstamo ya está creado en el sistema");
        }
    }


    public List<Cliente> obtenerClientes() {

        return getListaClientes();
    }


    public List<Empleado> obtenerEmpleados() {
        return getListaEmpleados();
    }


    public List<Objeto> obtenerObjetos() {

        return getListaObjetos();
    }

    public List<Prestamo> obtenerPrestamos() {

        return getListaPrestamos();
    }



    public void eliminarCliente(String cedula) {
        for (Cliente cliente : listaClientes){
            if (cliente.getCedula().equalsIgnoreCase(cedula)){
                getListaClientes().remove(cliente);
                break;
            }
        }
    }


    public void eliminarEmpleado(String cedula){
        for (Empleado empleado : listaEmpleados){
            if (empleado.getCedula().equalsIgnoreCase(cedula)){
                getListaEmpleados().remove(empleado);
                break;
            }
        }

    }


    public void eliminarObjeto(String id) {

        for (Objeto objeto : listaObjetos){
            if (objeto.getId().equalsIgnoreCase(id)){
                getListaObjetos().remove(objeto);
                break;
            }
        }
    }


    public void eliminarPrestamo(String numeroPrestamo) {

        for (Prestamo prestamo : listaPrestamos){
            if (prestamo.getNumeroPrestamo().equalsIgnoreCase(numeroPrestamo)){
                getListaPrestamos().remove(prestamo);
                break;
            }
        }
    }


    public void actualizarEmpleado (String cedula, String nombre,
                                    String apellido, String edad){
        for (Empleado empleado : listaEmpleados){
            if (empleado.getCedula().equals(cedula)){
                empleado.setNombre(nombre);
                empleado.setApellido(apellido);
                empleado.setEdad(edad);
                break;
            }
        }

    }


    public void actualizarCliente(String cedula, String nombre,
                                  String apellido, String  edad) {
        for (Cliente cliente : listaClientes) {
            if (cliente.getCedula().equals(cedula)) {
                cliente.setNombre(nombre);
                cliente.setApellido(apellido);
                cliente.setEdad(edad);
                break;
            }
        }
    }


    public void actualizarObjeto(String id, String nuevoNombre){

        for (Objeto objeto : listaObjetos){
            if (objeto.getId().equals(id)){
                objeto.setNombre(nuevoNombre);
                break;
            }
        }
    }


    public void actualizarPrestamo(String numeroPrestamo,
                                   LocalDate nuevaFechaPrestamo,
                                   LocalDate nuevaFechaentrega,
                                   String nuevaDescripcion){

        for (Prestamo prestamo : listaPrestamos){
            if (prestamo.getNumeroPrestamo().equals(numeroPrestamo)){
                prestamo.setFechaPrestamo(nuevaFechaPrestamo);
                prestamo.setFechaEntrega(nuevaFechaentrega);
                prestamo.setDescripcion(nuevaDescripcion);
                break;
            }
        }
    }


    public int devolverPosicionEmpleado(String cedula) {
        int posicion = -1;
        boolean bandera = false;
        for(int i = 0; i < listaEmpleados.size() && bandera == false; i++) {
            if(listaEmpleados.get(i).getCedula().equalsIgnoreCase(cedula)) {
                bandera = true;
                posicion = i;
            }
        }
        return posicion;
    }


    public int devolverPosicionObjeto(String id) {
        int posicion = -1;
        boolean bandera = false;
        for(int i = 0; i < listaObjetos.size() && bandera == false; i++) {
            if(listaObjetos.get(i).getId().equalsIgnoreCase(id)) {
                bandera = true;
                posicion = i;
            }
        }
        return posicion;
    }


    public int devolverPosicionCliente(String cedula) {
        int posicion = -1;
        boolean bandera = false;
        for(int i = 0; i < listaClientes.size() && bandera == false; i++) {
            if(listaClientes.get(i).getCedula().equalsIgnoreCase(cedula)) {
                bandera = true;
                posicion = i;
            }
        }
        return posicion;
    }


    public int devolverPosicionPrestamo(String numeroPrestamo) {
        int posicion = -1;
        boolean bandera = false;
        for(int i = 0; i < listaPrestamos.size() && bandera == false; i++) {
            if(listaPrestamos.get(i).getNumeroPrestamo().equalsIgnoreCase(numeroPrestamo)) {
                bandera = true;
                posicion = i;
            }
        }
        return posicion;
    }


    public Cliente mostrarCliente(String cedula){

        for (int i=0; i < listaClientes.size(); i++){
            Cliente cliente = listaClientes.get(i);
            if(cliente.getCedula().equals(cedula)){
                return cliente;
            }
        }
        return null;
    }

    public Empleado mostrarEmpleado(String cedula){

        for (int i=0; i < listaEmpleados.size(); i++){
            Empleado empleado = listaEmpleados.get(i);
            if(empleado.getCedula().equals(cedula)){
                return empleado;
            }
        }
        return null;
    }

    public Objeto mostrarObjeto(String id){

        for (int i=0; i < listaObjetos.size(); i++){
            Objeto objeto = listaObjetos.get(i);
            if(objeto.getId().equals(id)){
                return objeto;
            }
        }
        return null;
    }


    public Objeto mostrarInformacionObjeto(String id){
        int posicion = devolverPosicionObjeto(id);
        if(posicion != -1){
            return listaObjetos.get(posicion);
        }
        return null;
    }


    public void mostrarEmpleado() {
        List<Empleado> listaEmpleado = obtenerEmpleados();
        int tamanoLista = listaEmpleado.size();
        for (int i=0; i < tamanoLista; i++){
            Empleado empleado = listaEmpleado.get(i);
            System.out.println(empleado.toString());
        }

    }


    public void mostrarPrestamo() {
        List<Prestamo> listaPrestamos = obtenerPrestamos();
        int tamanoLista = listaPrestamos.size();
        for (int i=0; i < tamanoLista; i++){
            Prestamo prestamo = listaPrestamos.get(i);
            System.out.println(prestamo.toString());
        }

    }


    public ArrayList<Prestamo> listarPrestamos(String numeroPrestamo) throws Exception{
        ArrayList<Prestamo> prestamos = new ArrayList<>();
        for (Prestamo prestamo: listaPrestamos){
            if (prestamo.getNumeroPrestamo().equals(numeroPrestamo)){
                listaPrestamos.add(prestamo);
            }
        }
        return prestamos;
    }


    public List<Objeto> obtenerObjetosMasPrestados(int rango) {

        List<Objeto> masPrestados = new ArrayList<>(listaObjetos.stream()
                .filter(objeto -> objeto.getVecesPrestado() > rango)
                .toList());

        return masPrestados;
    }

    public List<Objeto> obtenerObjetosMenosPrestados(int rango) {

        List<Objeto> menosPrestados = new ArrayList<>(listaObjetos.stream()
                .filter(objeto -> objeto.getVecesPrestado() < rango)
                .toList());

        return menosPrestados;
    }



    public List<Cliente> obtenerClientesMasPrestamos(int rango) {

        List<Cliente> masPrestados = new ArrayList<>(listaClientes.stream()
                .filter(cliente -> contarPrestamos(cliente.getCedula()) > rango)
                .toList());

        return masPrestados;
    }

    public List<Cliente> obtenerClientesMenosPrestamos(int rango) {

        List<Cliente> menosPrestados = new ArrayList<>(listaClientes.stream()
                .filter(cliente -> contarPrestamos(cliente.getCedula()) < rango)
                .toList());

        return menosPrestados;
    }

    public int contarPrestamos(String cedulaCliente){
        int cantidad = 0;

        for(int i=0; i<listaPrestamos.size(); i++) {
            Prestamo prestamo = listaPrestamos.get(i);
            if(prestamo.getCliente().getCedula().equals(cedulaCliente)){
                cantidad++;
            }
        }
        return cantidad;
    }

    public String estaDisponible(String idObjeto){

        for(int i=0; i<listaPrestamos.size(); i++) {
            Prestamo prestamo = listaPrestamos.get(i);
            if( prestamo.getObjeto().getId().equals(idObjeto) ){

                if(prestamo.getFechaEntrega().isAfter(LocalDate.now())){
                    return "NO";
                }

            }
        }

        return "SI";

    }

    public List<Prestamo> listarPrestamosCliente(String cedulaCliente){

        List<Prestamo> respuesta = new ArrayList<>();

        for(Prestamo prestamo : listaPrestamos){

            if(prestamo.getCliente().getCedula().equals(cedulaCliente)){
                respuesta.add(prestamo);
            }

        }

        return respuesta;
    }


    @Override
    public String toString() {
        return "prestamoUq{" +
                "nombre='" + nombre + '\'' +
                '}';
    }

    public void obtenerCliente(String cedula) {
    }

    public void crearCliente() {
    }

    public void actualizarCliente() {
    }

    public void eliminarCliente() {
    }
}
