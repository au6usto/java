/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author au6usto
 */
public class Animal {

  private int id;
  private String origen;
  private int edad;
  private double peso;
  private Veterinario veterinario;
  private Sector sector;
  private Especie especie;

  public Animal(int id,String origen, Especie especie, int edad, double peso,
          Veterinario veterinario, Sector sector) {
    this.id = id;
    this.especie = especie;
    this.origen = origen;
    this.edad = edad;
    this.peso = peso;
    this.veterinario = veterinario;
    this.sector = sector;
  }

  public String getOrigen() {
    return origen;
  }

  public void setOrigen(String origen) {
    this.origen = origen;
  }

  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public double getPeso() {
    return peso;
  }

  public void setPeso(double peso) {
    this.peso = peso;
  }

  public Veterinario getVeterinario() {
    return veterinario;
  }

  public void setVeterinario(Veterinario veterinario) {
    this.veterinario = veterinario;
  }

  public Sector getSector() {
    return sector;
  }

  public void setSector(Sector sector) {
    this.sector = sector;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public Especie getEspecie() {
    return especie;
  }

  public void setEspecie(Especie especie) {
    this.especie = especie;
  }

  @Override
  public String toString() {
    return "Animal{" + "especie=" + especie + ", origen=" + origen + ", edad=" + edad + ", peso=" + peso + ", veterinario=" + veterinario + ", sector=" + sector + '}';
  }

}
