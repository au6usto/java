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
public interface IMainView {

  MainPresenter getPresenter();

  void setPresenter(MainPresenter mainPresenter);

  void updateModelFromView();

  void updateViewFromModel();

  void open();

  void close();

}
