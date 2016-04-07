/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presenter;

import views.*;

/**
 *
 * @author au6usto
 */
public class Main {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {

    MainView mainView = new MainView();
    NuevoAnimalView nuevoAnimalView = new NuevoAnimalView();
    ResultadosView resultadosView = new ResultadosView();

    MainPresenter mainPresenter = new MainPresenter(mainView, nuevoAnimalView, resultadosView);

    mainPresenter.run();
  }

}
