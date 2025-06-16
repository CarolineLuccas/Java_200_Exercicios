/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex_059;

import java.util.Scanner;

/**
 *059)Desenvolva um programa que leia números inteiros do usuário e exiba a soma
acumulada. O programa deve terminar quando o usuário digitar o número zero.
 * 
 * @author carol
 */
public class Ex_059 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        int somaAcumulada = 0;
        int valorDigitado;
        
        System.out.println("Digite numeros para somar. Digite 0 para parar.");
        System.out.println("Digite um numero: ");
        valorDigitado = ler.nextInt();
        
        while (valorDigitado != 0 ){
            somaAcumulada += valorDigitado;
            System.out.println("Digite outro numero: ");
            valorDigitado = ler.nextInt();
        }
        System.out.println("Soma total: " + somaAcumulada);
    }
    
}
