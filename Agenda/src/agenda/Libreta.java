/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author au6usto
 */
public class Libreta {
    ArrayList<Contacto> contactos = new ArrayList<>();
    
    private final String path = "/home/au6usto/";
    private final String filename = "agenda.txt";

    public Libreta() {
        cargarTxt();
    }
    
    public void agregar(Contacto contacto){
        if (contacto.getNombre().length() != 0){
            contactos.add(contacto);
        }
        Collections.sort(contactos);
    }
    
    public Contacto buscar(String nombre){
        for (Contacto contacto : contactos) {
            if (contacto.getNombre().equals(nombre)) {
                System.out.println("Si");
                return contacto;
            }
        }
        return null;
    }
    
    public String listar(){
        String resultado = "";
        for (Contacto contacto : contactos) {
            resultado += "\n" + contacto;
        }
        return resultado;
    }
     
    public void guardarTxt(){
        PrintWriter writer;
        try {
            writer = new PrintWriter(path+filename, "UTF-8");
            for (Contacto contacto : contactos) {
                writer.println(contacto.toString());
            }
            writer.close();
        } catch (FileNotFoundException | UnsupportedEncodingException ex) {
            ex.printStackTrace();
        }
    }
    
    public void cargarTxt(){
        BufferedReader br = null;

        try {

            String sCurrentLine;

            br = new BufferedReader(new FileReader(path+filename));

            while ((sCurrentLine = br.readLine()) != null) {
                String[] parts = sCurrentLine.split(",");
                Contacto contacto = new Contacto(parts[0], parts[1]);
                agregar(contacto);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
    
}
