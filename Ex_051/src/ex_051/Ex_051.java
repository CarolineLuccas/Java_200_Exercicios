/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex_051;

import java.util.Scanner;

/**
 *051)Desenvolva um programa que calcule o fatorial de um número inteiro fornecido
pelo usuário.

 * 
 * @author carol
 */
public class Ex_051 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite um numero para calcular o fatorial: ");
        int num = ler.nextInt();
        int fatorial = 1;
        
        for(int i = 1; i <= num; i++){
            fatorial *= i;
        }
        
        System.out.println("Fatorial de " + num + " eh: " + fatorial);
    }
    
}
