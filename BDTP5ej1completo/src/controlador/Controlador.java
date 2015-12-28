/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.*;
import vista.*;

/**
 *
 * @author
 */
public class Controlador {

    private VPrincipal vista;
    private VObraSocial vOSocial;
    private VPaciente vPaciente;
    private VMedicos vMedicos;
    private VMedicamentos vMedicamentos;
    private VOrdenMedica vOrdenMedica;
    private VItem vItem;
    private ObraSocial obrasocial;
    private Paciente paciente;
    private Medicos medicos;
    private Medicamentos medicamentos;
    private OrdenMedica ordenmedica;
    private Conexion con;

    public Controlador(Conexion con) {
        this.con = con;
        vista = new VPrincipal();
        vOSocial = new VObraSocial(vista, true);
        vPaciente = new VPaciente(vista, true);
        vMedicos = new VMedicos(vista, true);
        vMedicamentos = new VMedicamentos(vista, true);
        vOrdenMedica = new VOrdenMedica(vista, true);
        vItem = new VItem(vista, true);
        obrasocial = new ObraSocial(con);
        paciente = new Paciente(con);
        medicos = new Medicos(con);
        medicamentos = new Medicamentos(con);
        ordenmedica = new OrdenMedica(con);
    }
    //------------------------------------------

    public void ejecutar() {
        vOSocial.setControlador(this);
        vPaciente.setControlador(this);
        vMedicos.setControlador(this);
        vMedicamentos.setControlador(this);
        vOrdenMedica.setControlador(this);
        vItem.setControlador(this);
        vista.setControlador(this);
        vista.ejecutar();
    }
    //--------------------------------------------------------------

    public void procesar(String valor) {
        if (valor.equals(vista.MENU_OBRASOCIAL)) {
            vOSocial.ejecutar();
        }
        if (valor.equals(vista.MENU_PACIENTES)) {
            vPaciente.cargarOSocial(leerCargarOS());
            vPaciente.ejecutar();
        }
        if (valor.equals(vista.MENU_MEDICOS)) {
            vMedicos.ejecutar();
        }
        if (valor.equals(vista.MENU_MEDICAMENTOS)) {
            vMedicamentos.ejecutar();
        }
        if (valor.equals(vista.MENU_ORDEN_MEDICA)) {
            vOrdenMedica.cargarMedicos(leerCargarMedicos());
            vOrdenMedica.ejecutar();
        }
        //--------------------------------------
        // trabajamos sobre la clase ObraSocial
        //--------------------------------------
        if (valor.equals(vOSocial.BTN_GUARDAR)) {
            obrasocial.setCodigo(vOSocial.getCodigo());
            obrasocial.setNombre(vOSocial.getNombre());
            obrasocial.setDireccion(vOSocial.getDireccion());
            obrasocial.setTelefono(vOSocial.getTelefono());
            obrasocial.agregar();
        }
        //--------------------------------------
        if (valor.equals(vOSocial.BTN_MODIFICAR)) {
        // NO modificamos el codigo
            //obrasocial.setCodigo(vOSocial.getCodigo());
            obrasocial.setNombre(vOSocial.getNombre());
            obrasocial.setDireccion(vOSocial.getDireccion());
            obrasocial.setTelefono(vOSocial.getTelefono());
            obrasocial.modificar();
        }
        //--------------------------------------
        if (valor.equals(vOSocial.BTN_BUSCAR)) {
            obrasocial.setCodigo(vOSocial.getCodigo());
            if (obrasocial.buscar()) {
                vOSocial.setCodigo(obrasocial.getCodigo());
                vOSocial.setNombre(obrasocial.getNombre());
                vOSocial.setDireccion(obrasocial.getDireccion());
                vOSocial.setTelefono(obrasocial.getTelefono());
            } else {
                JOptionPane.showMessageDialog(null, "No se encontraron coincidencias");
            }
        }
        //--------------------------------------
        if (valor.equals(vOSocial.BTN_ELIMINAR)) {
            obrasocial.setCodigo(vOSocial.getCodigo());
            if (obrasocial.buscar()) {
                if (JOptionPane.showConfirmDialog(null, "Seguro de eliminar a " + obrasocial.getNombre(),
                        "Confirmar", JOptionPane.YES_NO_OPTION) == JOptionPane.OK_OPTION) {
                    obrasocial.eliminar();
                }
            } else {
                JOptionPane.showMessageDialog(null, "No se encontraron coincidencias");
            }
        }
        //--------------------------------------
        //--------------------------------------
        //--------------------------------------
        if (valor.equals(vPaciente.BTN_GUARDAR)) {
            paciente.setDni(vPaciente.getDni());
            paciente.setNombre(vPaciente.getNombre());
            paciente.setDomicilio(vPaciente.getDomicilio());
            paciente.setFechanacimiento(new Fecha(vPaciente.getFecha(), true));
            paciente.setObrasocial(new ObraSocial());
            paciente.getObrasocial().setCodigo(vPaciente.getObrasocial());
            paciente.agregar();
        }
        //--------------------------------------
        if (valor.equals(vPaciente.BTN_BUSCAR)) {
            // System.out.println("Fecha: " + paciente.getFechanacimiento().getFecha(false));
            paciente.setDni(vPaciente.getDni());
            if (paciente.buscar()) {
                vPaciente.setNombre(paciente.getNombre());
                vPaciente.setDomicilio(paciente.getDomicilio());
                vPaciente.setFecha(paciente.getFechanacimiento().getFecha(false)+"");
                vPaciente.setObrasocial(paciente.getObrasocial().getCodigo());
            } else {
                JOptionPane.showMessageDialog(null, "No se encontraron coincidencias");
            }
        }
        //--------------------------------------
        if (valor.equals(vPaciente.BTN_MODIFICAR)) {
            // NO modificamos el codigo

            paciente.setNombre(vPaciente.getNombre());
            paciente.setDni(vPaciente.getDni());
            paciente.setDomicilio(vPaciente.getDomicilio());
            obrasocial.modificar();
        }
        //--------------------------------------
        if (valor.equals(vPaciente.BTN_ELIMINAR)) {
            paciente.setDni(vPaciente.getDni());
            if (paciente.buscar()) {
                if (JOptionPane.showConfirmDialog(null, "Seguro de eliminar a " + paciente.getNombre(),
                        "Confirmar", JOptionPane.YES_NO_OPTION) == JOptionPane.OK_OPTION) {
                    paciente.eliminar();
                }
            } else {
                JOptionPane.showMessageDialog(null, "No se encontraron coincidencias");
            }
        }
        //--------------------------------------
        //--------------------------------------
        //--------------------------------------
        if (valor.equals(vMedicos.BTN_GUARDAR)) {
            medicos.setDni(vMedicos.getDni());
            medicos.setMatricula(vMedicos.getMatricula());
            medicos.setNombre(vMedicos.getNombre());
            medicos.setDomicilio(vMedicos.getDomicilio());
            medicos.setTelefono(vMedicos.getTelefono());
            medicos.setEspecialidad(vMedicos.getEspecialidad());
            medicos.agregar();
        }
        //--------------------------------------
        if (valor.equals(vMedicos.BTN_BUSCAR)) {
            medicos.setDni(vMedicos.getDni());
            if (medicos.buscar()) {
                vMedicos.setMatricula(medicos.getMatricula());
                vMedicos.setNombre(medicos.getNombre());
                vMedicos.setDomicilio(medicos.getDomicilio());
                vMedicos.setTelefono(medicos.getTelefono());
                vMedicos.setEspecialidad(medicos.getEspecialidad());
            } else {
                JOptionPane.showMessageDialog(null, "No se encontraron coincidencias");
            }
        }
        //--------------------------------------
        if (valor.equals(vMedicos.BTN_MODIFICAR)) {
            JOptionPane.showMessageDialog(null, "Completar para su funcionamiento");
        }
        //--------------------------------------
        if (valor.equals(vMedicos.BTN_ELIMINAR)) {
            JOptionPane.showMessageDialog(null, "Completar para su funcionamiento");
        }
        //--------------------------------------
        //--------------------------------------
        //--------------------------------------
        if (valor.equals(vMedicamentos.BTN_GUARDAR)) {
            medicamentos.setCodigo(vMedicamentos.getCodigo());
            medicamentos.setDescripcion(vMedicamentos.getDescripcion());
            medicamentos.setMonodroga(vMedicamentos.getMonodroga());
            medicamentos.setPrecio(vMedicamentos.getPrecio());
            medicamentos.agregar();
        }
        //--------------------------------------
        if (valor.equals(vMedicamentos.BTN_BUSCAR)) {
            JOptionPane.showMessageDialog(null, "Completar para su funcionamiento");
        }
        //--------------------------------------
        if (valor.equals(vMedicamentos.BTN_MODIFICAR)) {
            JOptionPane.showMessageDialog(null, "Completar para su funcionamiento");
        }
        //--------------------------------------
        if (valor.equals(vMedicamentos.BTN_ELIMINAR)) {
            JOptionPane.showMessageDialog(null, "Completar para su funcionamiento");
        }
        //--------------------------------------
        //--------------------------------------
        //--------------------------------------
        if (valor.equals(vOrdenMedica.BTN_GUARDAR)) {
            ordenmedica.setNroorden(vOrdenMedica.getOrden());
            ordenmedica.getMedico().setMatricula(vOrdenMedica.getMedico() + 1);
            ordenmedica.getMedico().buscar();
            ordenmedica.agregar();
        }
        //--------------------------------------
        if (valor.equals(vOrdenMedica.BTN_BUSCAR)) {
            ordenmedica.getPaciente().setDni(vOrdenMedica.getDni());
            if (ordenmedica.getPaciente().buscar()) {
                vOrdenMedica.setPaciente(ordenmedica.getPaciente().getNombre());
                vOrdenMedica.setObraSocial(ordenmedica.getPaciente().getObrasocial().getNombre());
            }
        }
        //--------------------------------------
        if (valor.equals(vOrdenMedica.BTN_AGREGAR)) {
            vItem.ejecutar();
        }
        //--------------------------------------
        if (valor.equals(vOrdenMedica.BTN_ELIMINAR)) {
            JOptionPane.showMessageDialog(null, "Completar para su funcionamiento");
        }
        //--------------------------------------
        if (valor.equals(vItem.BTN_BUSCAR)) {
            medicamentos.setCodigo(vItem.getCodigo());
            if (medicamentos.buscar()) {
                vItem.setDescripcion(medicamentos.getDescripcion());
                vItem.setPrecio(medicamentos.getPrecio());
            } else {
                JOptionPane.showMessageDialog(null, "no se encuentra el medicamento");
            }
        }
        //--------------------------------------
        if (valor.equals(vItem.BTN_ACEPTAR)) {
            medicamentos.setCantidad(vItem.getCantidad());
            ordenmedica.addMedicamento(medicamentos);
            Object fila[] = new Object[4];
            fila[0] = medicamentos.getCodigo();
            fila[1] = medicamentos.getDescripcion();
            fila[2] = medicamentos.getCantidad();
            fila[3] = medicamentos.getPrecio() * medicamentos.getCantidad();
            vOrdenMedica.addMedicamento(fila);
            vOrdenMedica.mostrar();
        }
        //--------------------------------------
    }
    //--------------------------------------------------------------

    public Object[] leerCargarOS() {
        ArrayList tmp = obrasocial.leer();
        Object lista[] = new Object[tmp.size()];
        for (int i = 0; i < tmp.size(); i++) {
            lista[i] = ((Object[]) tmp.get(i))[1];
        }
        return lista;
    }

    //--------------------------------------------------------------

    public Object[] leerCargarMedicos() {
        ArrayList tmp = medicos.leer();
        Object lista[] = new Object[tmp.size()];
        for (int i = 0; i < tmp.size(); i++) {
            lista[i] = ((Object[]) tmp.get(i))[2];
        }
        return lista;
    }
}
