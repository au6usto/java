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
public class Herbivoro extends Especie {
  private double comidaAdicional;
  
  public Herbivoro(double comidaAdicional, String nombre) {
    super(nombre);
    this.comidaAdicional = comidaAdicional;
  }
  
  public double getComidaAdicional() {
    return comidaAdicional;
  }

  public void setComidaAdicional(double comidaAdicional) {
    this.comidaAdicional = comidaAdicional;
  }

  @Override
  public double calcularComida(double peso) {
    return peso * 2 + this.getComidaAdicional();
  }

}
