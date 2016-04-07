/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author au6usto
 */
public final class Zoologico {

  private static int id = 0;
  private static ArrayList<Animal> animales = new ArrayList<>();
  private static ArrayList<Sector> sectores = new ArrayList<>();
  private static ArrayList<Veterinario> veterinarios = new ArrayList<>();
  private static ArrayList<Especie> especies = new ArrayList<>();

 

  public static ArrayList<Animal> getAnimales() {
    return animales;
  }

  public static void setAnimales(ArrayList<Animal> animales2) {
    animales = animales2;
  }

  public static void addAnimal(Object especie, String origen, int edad, 
          double peso, Object veterinario, Object sector) { 
    
    Zoologico.id++;
      
    Especie esp = (Especie) especie;
    Veterinario vet = (Veterinario) veterinario;
    Sector sec = (Sector) sector;
       
    animales.add(new Animal(Zoologico.id, origen, esp, edad, peso, vet, sec));
  }
  
  

  public static ArrayList<Sector> getSectores() {
    if (sectores.size() < 1) {
      sectores.add(new Sector(1, -26.8302732, -65.2074667));
      sectores.add(new Sector(2, -26.8170952, -65.2004479));
      sectores.add(new Sector(3, -26.8192588, -65.2049463));
      sectores.add(new Sector(4, -26.8304401, -65.2060996));
    }

    return sectores;
  }
  
  public static void setSectores(ArrayList<Sector> sectores2) {
    sectores = sectores2;
  }

  public static ArrayList<Veterinario> getVeterinarios() {
    if (veterinarios.size() < 1) {
      veterinarios.add(new Veterinario("Juan Perez", "3814654684", "Rivadavia 1050"));
      veterinarios.add(new Veterinario("Jose Gonzalez", "3814654684", "25 de Mayo 30"));
      veterinarios.add(new Veterinario("Pedro Ramirez", "3814654684", "24 de septiembre 415"));
    }

    return veterinarios;
  }
  
  public static void setVeterinarios(ArrayList<Veterinario> veterinarios2) {
    veterinarios = veterinarios2;
  }

  public static ArrayList<Especie> getEspecies() {
    if (especies.size() < 1) {
      especies.add(new Carnivoro(0.9, "León"));
      especies.add(new Carnivoro(0.8, "Tigre"));
      especies.add(new Carnivoro(0.7, "Lobo"));
      especies.add(new Carnivoro(0.6, "Cocodrilo"));
      especies.add(new Carnivoro(0.5, "Cóndor"));
      especies.add(new Herbivoro(20, "Cebra"));
      especies.add(new Herbivoro(30, "Elefante"));
      especies.add(new Herbivoro(40, "Jirafa"));
      especies.add(new Herbivoro(50, "Koala"));
    }

    return especies;
  }

  public static DefaultTableModel getAniamlesArray() {
    DefaultTableModel table = new DefaultTableModel();
    table.addColumn("#");
    table.addColumn("Especie");
    table.addColumn("Origen");
    table.addColumn("Edad");
    table.addColumn("Peso");
    table.addColumn("Veterinario");
    table.addColumn("Sector");
    for (Animal animal : getAnimales()) {
      Object[] row = new Object[7];
      row[0] = animal.getId();
      row[1] = animal.getEspecie().getNombre();
      row[2] = animal.getOrigen();
      row[3] = animal.getEdad();
      row[4] = animal.getPeso();
      row[5] = animal.getVeterinario();
      row[6] = animal.getSector();
      table.addRow(row);
    }
    return table;
  }

  public static int contarAnimales(String tipo) {
    int cantidadAnimales = 0;

    for (Animal animal : animales) {
      if (animal.getEspecie().getClass().getName().equals("model." + tipo)) {
        cantidadAnimales++;
      }
    }
    return cantidadAnimales;
  }

  public static double calcularPeso(String tipo) {
    int pesoHerbivoros = 0;

    for (Animal animal : animales) {
      if (animal.getEspecie().getClass().getName().equals("model." + tipo)) {
        pesoHerbivoros += animal.getPeso();
      }
    }
    return pesoHerbivoros;
  }

  public static double calcularComida(String tipo) {
    int comidaHerbivoros = 0;

    for (Animal animal : animales) {
      if (animal.getEspecie().getClass().getName().equals("model." + tipo)) {
        comidaHerbivoros += animal.getEspecie().calcularComida(animal.getPeso());
      }
    }
    return comidaHerbivoros;
  }
}
