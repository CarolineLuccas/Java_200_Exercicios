/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex_018;

import java.util.Scanner;

/**
 *018) Desenvolva um programa que leia três números inteiros e exiba o maior deles
 * 
 * @author carol
 */
public class Ex_018 {

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
        
        int maior = num1;
        
        if(num2 > maior){
            maior = num2;
        }
        if(num3 > maior)
        {
            maior = num3;
        }
        
        System.out.println("O maior numero eh: " + maior);
    }
    
}
