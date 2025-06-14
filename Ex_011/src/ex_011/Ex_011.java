/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex_011;

import java.util.Scanner;

/**
 *011)Crie um programa que leia dois números inteiros do usuário e exiba a soma, subtração,
  multiplicação, divisão e o módulo desses números no console.
 * 
 * @author carol
 */
public class Ex_011 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite o primeiro numero inteiro: ");
        int num1 = ler.nextInt();
        
        System.out.println("Digite o segundo numero inteiro: ");
        int num2 = ler.nextInt();
        
        int soma = num1 + num2;
        int subtracao = num1 - num2;
        int multiplicacao = num1 * num2;
        int divisao = num1 / num2;
        int modulo = num1 % num2;
        
        System.out.println("Soma: " + soma);
        System.out.println("Subtracao: " + subtracao);
        System.out.println("Multiplicacao: " + multiplicacao);
        System.out.println("Divisao: " + divisao);
        System.out.println("Modulo: " + modulo);
    }
    
}
