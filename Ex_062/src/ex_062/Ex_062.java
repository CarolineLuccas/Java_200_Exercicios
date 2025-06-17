/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex_062;

import java.util.Scanner;

/**
 *062)Desenvolva um programa que leia um número e multiplique esse número por 2
repetidamente até o valor exceder 1000.
 * 
 * @author carol
 */
public class Ex_062 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite um numero: ");
        int numero = ler.nextInt();
        
        while (numero <= 1000){
            numero *= 2;
            System.out.println("Valor apos multiplicacao: " + numero);
        }
        System.out.println("Valor final apos multiplicacao acumulada: " + numero);
    }  
}
