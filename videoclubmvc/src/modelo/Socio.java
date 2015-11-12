package modelo;

public class Socio {
    int codigo;
    String documento;
    String nombre;
    String domicilio;

    @Override
    public String toString() {
        return "Socio{" + "codigo=" + codigo + ", documento=" + documento + ", nombre=" + nombre + ", domicilio=" + domicilio + '}';
    }

  
  
    public Socio(int codigo, String documento, String nombre, String domicilio) {
        this.codigo = codigo;
        this.documento = documento;
        this.nombre = nombre;
        this.domicilio = domicilio;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }
  
}
