/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex_050;

import java.util.Scanner;

/**
 *050)Crie um programa que exiba a tabuada de um número fornecido pelo usuário,
de 1 a 10.

 * 
 * @author carol
 */
public class Ex_050 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite um numero para ver sua tabuada: ");
        int numero = ler.nextInt();
        
        for(int i=1; i <= 10; i++){
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
    
}
