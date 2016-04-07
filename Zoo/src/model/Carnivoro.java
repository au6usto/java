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
public class Carnivoro extends Especie {
  private double porcentajeComidaAdicional;
  
  public Carnivoro(double porcentajeComidaAdicional, String nombre) {
    super(nombre);
    this.porcentajeComidaAdicional = porcentajeComidaAdicional;
  }

  public double getPorcentajeComidaAdicional() {
    return porcentajeComidaAdicional;
  }

  public void setPorcentajeComidaAdicional(double porcentajeComidaAdicional) {
    this.porcentajeComidaAdicional = porcentajeComidaAdicional;
  }

  @Override
  public double calcularComida(double peso) {
    return peso * this.getPorcentajeComidaAdicional();
  }

}
