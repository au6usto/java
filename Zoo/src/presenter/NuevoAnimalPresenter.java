/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presenter;

import model.Zoologico;

/**
 *
 * @author au6usto
 */
public class NuevoAnimalPresenter {
        
    IMainView mainView;
    INuevoAnimalView nuevoAnimalView;
    
    public NuevoAnimalPresenter(INuevoAnimalView nuevoAnimalView, IMainView mainView){
        this.nuevoAnimalView = nuevoAnimalView;
        this.mainView = mainView;
    }
    
    public void save(Object especie, String origen, int edad, 
          double peso, Object veterinario, Object sector){
      
        Zoologico.addAnimal(especie, origen, edad, peso, veterinario, sector);
        mainView.updateViewFromModel();
    }
}
