package co.edu.uniquindio.parcial2.parcial_2_yamis.model;

public class Objeto {
    private String nombre;
    private String id;
    private int vecesPrestado;
    PrestamoUq ownedByPrestamoUq;

    public Objeto() {
    }

    public Objeto(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
    }

    public int getVecesPrestado() {
        return vecesPrestado;
    }

    public void setVecesPrestado(int vecesPrestado) {
        this.vecesPrestado = vecesPrestado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public PrestamoUq getOwnedByPrestamoUq() {
        return ownedByPrestamoUq;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setOwnedByPrestamoUq(PrestamoUq ownedByPrestamoUq) {
        this.ownedByPrestamoUq = ownedByPrestamoUq;
    }

    @Override
    public String toString() {
        return "Objeto{" +
                "nombre='" + nombre + '\'' +
                ", id='" + id + '\'' +
                ", vecesPrestado='" + vecesPrestado + '\'' +
                '}';
    }
}
