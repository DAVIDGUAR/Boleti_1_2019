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

        final double conversor = 1.10;//no se podria declarar como final ya que es un valor en constante cambio.

        double euro, dolar, cambio;

        System.out.println("Elige que quieres cambiar:\n 1-Euro.\n 2-Dolar");

        int dato = Integer.parseInt(JOptionPane.showInputDialog("Seleciona una de las opcines anteriores (1/2)"));

        switch (dato) {

            case 1:

                euro = Integer.parseInt(JOptionPane.showInputDialog("Introduce los euros a cambiar"));

                cambio = euro * conversor;

                System.out.println("Por " + euro + " €, tendras " + cambio + " $. ");

                break;

            case 2:

                dolar = Integer.parseInt(JOptionPane.showInputDialog("Introduce los dolar a cambiar"));

                cambio = dolar / conversor;

                System.out.println("Por " + dolar + " €, tendras " + cambio + " $. ");

                break;

        }
    }

}
