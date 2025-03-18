/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase1803;

import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Automovil;



/**
 *
 * @author Usuario-1
 */
public class Inicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            
            Automovil auto=new Automovil();
            System.out.println(auto);
            System.out.println(auto.verDetalles());
            //ESTO NO SE HACE!!!!!
            //auto.gasolina=1000;
            //System.out.println(auto.gasolina);
            auto.setGasolina(101);
            System.out.println(auto.getGasolina());
        } catch (Exception ex) {
            //Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        }
        
      
        
    }
    
}
