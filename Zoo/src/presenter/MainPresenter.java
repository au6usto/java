/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presenter;

/**
 *
 * @author au6usto
 */
public class MainPresenter {

  MainPresenter mainPresenter;
  NuevoAnimalPresenter nuevoAnimalPresenter;
  ResultadosPresenter resultadosPresenter;

  IMainView mainView;
  INuevoAnimalView nuevoAnimalView;
  IResultadosView resultadosView;

  public MainPresenter(IMainView view, INuevoAnimalView view2, IResultadosView view3) {
    mainView = view;
    nuevoAnimalView = view2;
    resultadosView = view3;

    nuevoAnimalPresenter = new NuevoAnimalPresenter(nuevoAnimalView, mainView);
    resultadosPresenter = new ResultadosPresenter(resultadosView);
  }

  public void run() {
    mainView.setPresenter(this);
    mainView.updateViewFromModel();
    mainView.open();
  }

  public void runNuevoAnimal() {
    nuevoAnimalView.setPresenter(nuevoAnimalPresenter);
    nuevoAnimalView.open();
  }

  public void runResultados() {
    resultadosView.setPresenter(resultadosPresenter);
    resultadosView.updateViewFromModel();
    resultadosView.open();
  }

}
