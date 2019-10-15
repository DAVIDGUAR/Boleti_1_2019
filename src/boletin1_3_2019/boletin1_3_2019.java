/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin1_3_2019;

import javax.swing.JOptionPane;

/**
 *
 * @author drodriguezguardiola
 */
public class boletin1_3_2019 {
    
     public static void main(String[] args) {
         
         
         final double conversor=0.91;
         
         double euro,dolar,cambio;
         
         
         System.out.println("Elige que quieres cambiar: 1-Euro.\n 2-Dolar");
         
         int dato=Integer.parseInt(JOptionPane.showInputDialog("Seleciona una de las opcines anteriores (1/2)"));
         
       
                 
                 
          switch (dato){
              
              
              case 1:
                  
                  euro=JOptionPane.showInputDialog("Introduce los euros a cambiar")
                  
                  cambio=euro*coversor;
              
              
              break;
          }      
         
         
         double cambio_euro=conversor*dolar;
         
        double cambio_dolar=conversor*euro;
         
         
         
     }
    
    
    
}
