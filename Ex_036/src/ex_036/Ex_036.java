/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex_036;

import java.util.Scanner;

/**
 *036) Desenvolva um programa que leia três números inteiros e exiba o maior deles.
 Caso dois ou mais números sejam iguais, exiba uma mensagem indicando que há números
 iguais.

 * 
 * 
 * @author carol
 */
public class Ex_036 {

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
        
        System.out.println("Digite o terceiro numero inteiro: ");
        int num3 = ler.nextInt();
        
        if(num1 == num2 && num2 == num3){
            System.out.println("Todos os numeros sao iguais.");
        }else if(num1 == num2 || num2 == num3 || num1 == num3){
            System.out.println("Ha dois numeros iguais!");
        }
        if(num1 > num2 && num1 > num3){
            System.out.println("O maior numero eh: " + num1);
        }else if(num2 > num1 && num2 > num3){
            System.out.println("O maior numero eh: " + num2);
        }else{
            System.out.println("O maior numero eh: " + num3);
        }
    }
    
}
