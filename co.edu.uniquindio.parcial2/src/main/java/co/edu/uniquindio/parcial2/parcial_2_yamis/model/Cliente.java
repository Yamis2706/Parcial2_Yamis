package co.edu.uniquindio.parcial2.parcial_2_yamis.model;

public class Cliente extends Persona{


    private String nombre;
    private String apellido;
    private String cedula;
    private String edad;

    PrestamoUq ownedByPrestamoUq;


    public Cliente() {
    }

    public Cliente(String nombre, String apellido, String cedula, String edad,
                   String nombre1, String apellido1, String cedula1, String edad1,
                   PrestamoUq ownedByPrestamoUq) {
        super(nombre, apellido, cedula, edad);
        this.nombre = nombre1;
        this.apellido = apellido1;
        this.cedula = cedula1;
        this.edad = edad1;
        this.ownedByPrestamoUq = ownedByPrestamoUq;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getApellido() {
        return apellido;
    }

    @Override
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String getCedula() {
        return cedula;
    }

    @Override
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    @Override
    public String getEdad() {
        return edad;
    }

    @Override
    public void setEdad(String edad) {
        this.edad = edad;
    }

    @Override
    public PrestamoUq getOwnedByPrestamoUq() {
        return ownedByPrestamoUq;
    }

    @Override
    public void setOwnedByPrestamoUq(PrestamoUq ownedByPrestamoUq) {
        this.ownedByPrestamoUq = ownedByPrestamoUq;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", cedula='" + cedula + '\'' +
                ", edad='" + edad + '\'' +
                '}';
    }
}
