
package emergencias;

/**
 * UTN-FRT ISI
 * @author au6usto
 */
public class Llamada {
    private String dni;
    private String nombre;
    private String address;
    private Hospital hospital;
    private boolean nursed;

    public Llamada(String dni, String nombre, String address, Hospital hospital, boolean nursed) {
        this.dni = dni;
        this.nombre = nombre;
        this.address = address;
        this.hospital = hospital;
        this.nursed = nursed;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public boolean isNursed() {
        return nursed;
    }

    public void setNursed(boolean nursed) {
        this.nursed = nursed;
    }
    
    
}
