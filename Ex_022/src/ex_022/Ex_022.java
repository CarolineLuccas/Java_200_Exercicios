/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex_022;

import java.util.Scanner;

/**
 *022)Crie um programa que leia três números inteiros e verifique se pelo menos um deles é
 maior que 10 (usando o operador ||). Em seguida, verifique se todos são maiores que 10
 (usando o operador &&).

 * 
 * @author carol
 */
public class Ex_022 {

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
        
        if(num1 > 10 || num2 > 10 || num3 > 10){
            System.out.println("Pelo menos um dos numeros eh maior do que 10!");
        }else{
            System.out.println("Nenhum dos numeros eh maior do que 10!");        }
    }
    
}
