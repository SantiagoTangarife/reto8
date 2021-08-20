/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto8;
import reto8.FuncionesDeRepaso;

/**
 *
 * @author saxss
 */
public class reto8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String name = System.getProperty("user.dir");
        //System.out.println(name+"\TSLA.csv");
        String ruta=(name+"/TSLA.csv");
        FuncionesDeRepaso a= new FuncionesDeRepaso();
        a.leerYSeparar(ruta);
        a.leerYSeparar10(ruta);
        
        
        
    }
    
}
