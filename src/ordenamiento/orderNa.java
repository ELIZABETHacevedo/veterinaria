/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenamiento;

import Entidades.Persona;
import Entidades.Relaciones;
import java.util.Comparator;

/**
 *
 * @author Mery Acevedo
 */
public class orderNa implements Comparator<Relaciones>{
//
//    @Override
//    public int compare(Persona t, Persona t1) {
//        return t.getNombre().compareTo(t1.getNombre());
//        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    @Override
    public int compare(Relaciones t, Relaciones t1) {
        
        return t.getDuennio().getNombre().compareTo(t1.getDuennio().getNombre());
        
        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
