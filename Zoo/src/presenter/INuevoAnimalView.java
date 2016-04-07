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
public interface INuevoAnimalView {

  NuevoAnimalPresenter getPresenter();

  void setPresenter(NuevoAnimalPresenter nuevoAnimalPresenter);

  void updateModelFromView();

  void updateViewFromModel();

  void open();

  void close();
}
