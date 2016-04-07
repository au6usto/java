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
public class Sector {

  int numero;
  double latitud;
  double longitud;

  public Sector(int numero, double latitud, double longitud) {
    this.numero = numero;
    this.latitud = latitud;
    this.longitud = longitud;
  }

  public int getNumero() {
    return numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public double getLatitud() {
    return latitud;
  }

  public void setLatitud(double latitud) {
    this.latitud = latitud;
  }

  public double getLongitud() {
    return longitud;
  }

  public void setLongitud(double longitud) {
    this.longitud = longitud;
  }

  @Override
  public String toString() {
    return Integer.toString(numero);
  }

}
