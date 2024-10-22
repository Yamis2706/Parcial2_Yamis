package co.edu.uniquindio.parcial2.parcial_2_yamis.model;

import co.edu.uniquindio.parcial2.parcial_2_yamis.factory.dto.ClienteDto;

import java.time.LocalDate;
import java.util.Date;

public class Prestamo {

    private Cliente cliente;
    private Objeto objeto;
    private Empleado empleado;
    private String numeroPrestamo;
    private LocalDate fechaPrestamo;
    private LocalDate fechaEntrega;
    private String descripcion;

    PrestamoUq ownedByPrestamoUq;

    public Prestamo(){

    }

    public Prestamo(Cliente cliente, Objeto objeto, Empleado empleado, String numeroPrestamo, LocalDate fechaPrestamo, LocalDate fechaEntrega, String descripcion) {
        this.cliente = cliente;
        this.objeto = objeto;
        this.empleado = empleado;
        this.numeroPrestamo = numeroPrestamo;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaEntrega = fechaEntrega;
        this.descripcion = descripcion;
    }

    public String getNumeroPrestamo() {
        return numeroPrestamo;
    }

    public void setNumeroPrestamo(String numeroPrestamo) {
        this.numeroPrestamo = numeroPrestamo;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public LocalDate getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(LocalDate fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public PrestamoUq getOwnedByPrestamoUq() {
        return ownedByPrestamoUq;
    }

    public void setOwnedByPrestamoUq(PrestamoUq ownedByPrestamoUq) {
        this.ownedByPrestamoUq = ownedByPrestamoUq;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Objeto getObjeto() {
        return objeto;
    }

    public void setObjeto(Objeto objeto) {
        this.objeto = objeto;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
}
