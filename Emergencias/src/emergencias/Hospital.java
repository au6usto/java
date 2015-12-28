
package emergencias;

import java.util.ArrayList;

/**
 * UTN-FRT ISI
 * @author au6usto
 */
public class Hospital {
    private String name;
    private String address;
    private ArrayList<Ambulancia> ambulancias;
    private int emergencies;

    public Hospital(String name, String address) {
        this.name = name;
        this.address = address;
        this.ambulancias = new ArrayList<>();
        this.emergencies = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getEmergencies() {
        return emergencies;
    }

    public void incrementEmergencies() {
        this.emergencies++;
    }

    public void addAmbulancia(Ambulancia a){
        ambulancias.add(a);
    }
    
    @Override
    public String toString() {
        return "Hospital{" + "name=" + name + ", address=" + address + ", ambulancias=" + ambulancias + ", emergencies=" + emergencies + '}';
    }
    
    
    
}
