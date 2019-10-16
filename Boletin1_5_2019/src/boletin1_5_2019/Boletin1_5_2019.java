/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin1_5_2019;

import javax.swing.JOptionPane;

/**
 *
 * @author david
 */
public class Boletin1_5_2019 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        float milla_marina,metros;
        
        final float conversor=1852;
        
        
       milla_marina=Float.parseFloat(JOptionPane.showInputDialog("Introduce las millas"));
       
       
       metros=(conversor*milla_marina);
       
        System.out.println("Hay en " +milla_marina+ " millas marinas "+ metros+" metros.");
        
        
    }
    
}
