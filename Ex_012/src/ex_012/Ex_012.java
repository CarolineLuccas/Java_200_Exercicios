/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex_012;

import java.util.Scanner;

/**
 *Escreva um programa que leia três números inteiros do usuário e calcule a média
 * aritmética deles. Exiba os resultados no console.
 * 
 * @author carol
 */
public class Ex_012 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite o primeiro numero inteiro");
        int num1 = ler.nextInt();
        
        System.out.println("Digite o segundo numero inteiro");
        int num2 = ler.nextInt();
        
        System.out.println("Digite o terceiro numero inteiro");
        int num3 = ler.nextInt();
        
        double media = (num1 + num2 + num3)/3;
        
        System.out.println("A media aritmetica eh: " + media);
    }
    
}
