package co.edu.uniquindio.parcial2.parcial_2_yamis.model;

import java.util.ArrayList;
import java.util.List;

public class PrestamoUq {
    private String nombre;

    List<Cliente> listaClientes = new ArrayList<>();
    List<Empleado> listaEmpleados = new ArrayList<>();
    List<Objeto> listObjetos = new ArrayList<>();

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

    public List<Objeto> getListObjetos() {
        return listObjetos;
    }

    public void setListObjetos(List<Objeto> listObjetos) {
        this.listObjetos = listObjetos;
    }

    /**
     *Metodo para crear un cliente
     * @param nombre
     * @param apellido
     * @param cedula
     * @param edad
     */
    public void crearCliente(String nombre, String apellido, String cedula, int edad){
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
            System.out.println("El cliente ya esta creado en el sistema");
        }
    }

    /**
     * Metodo para crear un empleado
     * @param nombre
     * @param apellido
     * @param cedula
     * @param edad
     */

    public void crearEmpleado(String nombre, String apellido, String cedula, int edad){

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
            System.out.println("El empleado ya esta creado en el sistema");
        }
    }

    /**
     * Metodo para crear un objeto
     * @param nombre
     * @param id
     */

    public void crearObjeto(String nombre, String id){

        int resultadoBusqueda = devolverPosicionObjeto(id);
        if (resultadoBusqueda == -1){
            Objeto objeto = new Objeto();
            objeto.setId(id);
            objeto.setNombre(nombre);
            getListObjetos().add(objeto);
            System.out.println("Objeto creado exitosamente");

        }else {
            System.out.println("El objeto ya esta creado en el sistema");
        }
    }

    /**
     * Metodo para obtener la lista de todos los clientes
     * @return list<Cliente>
     */
    public List<Cliente> obtenerClientes() {
        return getListaClientes();
    }

    /**
     * Metodo para obtener la lista de todos los empleados
     * @return list<Empleado>
     */
    public List<Empleado> obtenerEmpleados() {
        return getListaEmpleados();
    }

    /**
     * Metodo para obtener la lista de todos los objetos
     * @return list<Objeto>
     */

    public List<Objeto> obtenerObjetos() {
        return getListObjetos();
    }

    /**
     * Metodo para eliminar un cliente
     * @param cedula
     */

    public void eliminarCliente(String cedula) {
        for (Cliente cliente : listaClientes){
            if (cliente.getCedula().equalsIgnoreCase(cedula)){
                getListaClientes().remove(cliente);
                break;
            }
        }
    }


    /**
     * Metodo para eliminar un empleado
     * @param cedula
     */
    public void eliminarEmpleado(String cedula){
        for (Empleado empleado : listaEmpleados){
            if (empleado.getCedula().equalsIgnoreCase(cedula)){
                getListaEmpleados().remove(empleado);
                break;
            }
        }

    }

    /**
     * Metodo para eliminar un objeto
     * @param id
     */
    public void eliminarObjeto(String id) {

        for (Objeto objeto : listObjetos){
            if (objeto.getId().equalsIgnoreCase(id)){
                getListObjetos().remove(objeto);
                break;
            }
        }
    }

    /**
     * Metodo para actualizar un empleado
     * @param cedula
     * @param nombre
     * @param apellido
     * @param edad
     */

    public void actualizarEmpleado (String cedula, String nombre, String apellido, int edad){
        for (Empleado empleado : listaEmpleados){
            if (empleado.getCedula().equals(cedula)){
                empleado.setNombre(nombre);
                empleado.setApellido(apellido);
                empleado.setEdad(edad);
                break;
            }
        }

    }

    /**
     * Metodo para actualizar un cliente
     * @param cedula
     * @param nombre
     * @param apellido
     * @param edad
     */

    public void actualizarCliente(String cedula, String nombre, String apellido, int edad) {
        for (Cliente cliente : listaClientes) {
            if (cliente.getCedula().equals(cedula)) {
                cliente.setNombre(nombre);
                cliente.setApellido(apellido);
                cliente.setEdad(edad);
                break;
            }
        }
    }

    /**
     * Metodo para actualizar un objeto
     * @param id
     * @param nuevoNombre
     */

    public void actualizarObjeto(String id, String nuevoNombre){

        for (Objeto objeto : listObjetos ){
            if (objeto.getId().equals(id)){
                objeto.setNombre(nuevoNombre);
                break;
            }
        }
    }

    /**
     * Metodo para comprobar si un empleado ya existe
     * @param cedula
     * @return
     */

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

    /**
     * Metodo para verificar si un objeto ya existe
     * @param id
     * @return
     */

    public int devolverPosicionObjeto(String id) {
        int posicion = -1;
        boolean bandera = false;
        for(int i = 0; i < listObjetos.size() && bandera == false; i++) {
            if(listObjetos.get(i).getId().equalsIgnoreCase(id)) {
                bandera = true;
                posicion = i;
            }
        }
        return posicion;
    }

    /**
     * Metodo para verificar si un cliente ya existe
     * @param cedula
     * @return
     */

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

    /**
     * Metodo para leer o mostrar los clientes
     */

    public void mostrarCliente(){
        List<Cliente> listaClientes = obtenerClientes();
        int tamanoLista = listaClientes.size();
        for (int i=0; i < tamanoLista; i++){
            Cliente cliente = listaClientes.get(i);
            System.out.println(cliente.toString());
        }
    }

    /**
     * Metodo para leer o mostrar los objetos
     */

    public void mostrarObjeto(){
        List<Objeto> listaObjetos = obtenerObjetos();
        int tamanoLista = listaObjetos.size();
        for (int i=0; i < tamanoLista; i++){
            Objeto objeto = listaObjetos.get(i);
            System.out.println(objeto.toString());
        }
    }

    /**
     * Metodo para leer o mostrar los empleados
     */

    public void mostrarEmpleado() {
        List<Empleado> listaEmpleado = obtenerEmpleados();
        int tamanoLista = listaEmpleado.size();
        for (int i=0; i < tamanoLista; i++){
            Empleado empleado = listaEmpleado.get(i);
            System.out.println(empleado.toString());
        }

    }

    @Override
    public String toString() {
        return "prestamoUq{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
