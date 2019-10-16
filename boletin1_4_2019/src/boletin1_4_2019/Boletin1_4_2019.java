/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin1_4_2019;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class Boletin1_4_2019 {

    public static void main(String[] args) {

        double num1, num2, suma, resta, producto, coeficiente;

        System.out.println("Introduce el primer numero");
        
        Scanner numa = new Scanner(System.in);

        num1 = numa.nextDouble();
        
        System.out.println("Introduce el segundo numero");
        
        Scanner numb = new Scanner(System.in);

        num2 = numb.nextDouble();

        suma = num1 + num2;

        resta = num1 - num2;

        producto = num1 * num2;

        coeficiente = num1 / num2;
        
        System.out.println("Suma= "+suma+ "\nResta = " + resta + "\nMultiplicacion5 = " +producto+ "\nDivision = " +coeficiente);

    }

}
