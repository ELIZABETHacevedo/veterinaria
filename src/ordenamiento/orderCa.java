/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenamiento;

import Entidades.Consulta;
import Entidades.Relaciones;
import Entidades.clinica;
import java.util.Comparator;

/**
 *
 * @author Mery Acevedo
 */
public class orderCa implements Comparator<Relaciones>{
//
//    @Override
//    public int compare(Consulta t, Consulta t1) {
//        return Double.compare(t.getMonto(), t1.getMonto());
//        //To change body of generated methods, choose Tools | Templates.
//    }

    @Override
    public int compare(Relaciones t, Relaciones t1) {
        return Double.compare(t.getoConsulta().getMonto(), t1.getoConsulta().getMonto());
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
