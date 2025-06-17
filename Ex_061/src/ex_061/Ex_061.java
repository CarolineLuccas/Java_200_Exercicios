/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex_061;

import java.util.Scanner;

/**
 *061)Crie um programa que leia um número inteiro positivo e encontre a raiz
quadrada aproximada desse número. Continue a tentativa até encontrar a aproximação
correta.

 * 
 * @author carol
 */
public class Ex_061 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite um numero inteiro positivo: ");
        int numero = ler.nextInt();
        
        int raizAprox = 0;
        while (raizAprox * raizAprox < numero){
            raizAprox++;
        }
        
        if (raizAprox * raizAprox == numero){
            System.out.println("Raiz quadrada exata de " + numero + " eh: " + raizAprox);
        } else{
            System.out.println("Raiz quadrada aproximada de " + numero + " eh: " + raizAprox);
        }
    }  
}
