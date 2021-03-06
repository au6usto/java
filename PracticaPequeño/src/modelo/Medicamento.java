package modelo;
public class Medicamento {
    private String nombre;
    private String dosis;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDosis() {
        return dosis;
    }

    public void setDosis(String dosis) {
        this.dosis = dosis;
    }

    public Medicamento(String nombre, String dosis) {
        this.nombre = nombre;
        this.dosis = dosis;
    }

    @Override
    public String toString() {
        return "Medicamento{" + "nombre=" + nombre + ", dosis=" + dosis + '}';
    }
}
