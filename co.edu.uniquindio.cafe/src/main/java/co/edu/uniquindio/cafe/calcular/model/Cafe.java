package co.edu.uniquindio.cafe.calcular.model;

public class Cafe {
    private String descripcion;
    private double costo;

    public Cafe() {
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String cafe) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return costo;
    }

    public void setPrecio(double precio) {
        this.costo = costo;
    }

    @Override
    public String toString() {
        return "Cafe{" +
                "descripcion='" + descripcion + '\'' +
                ", costo=" + costo +
                '}';
    }
}
