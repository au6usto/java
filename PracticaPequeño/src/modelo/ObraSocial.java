package modelo;
class ObraSocial {
    private String nombre;
    private String tipo;
    private String numero;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public ObraSocial(String nombre, String tipo, String numero) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "ObraSocial{" + "nombre=" + nombre + ", tipo=" + tipo + ", numero=" + numero + '}';
    }
}
