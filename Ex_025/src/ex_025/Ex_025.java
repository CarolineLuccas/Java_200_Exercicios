/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex_025;

import java.util.Scanner;

/**
 *025)Escreva um programa que leia três números inteiros e verifique se pelo menos dois deles
 são positivos.
 * 
 * @author carol
 */
public class Ex_025 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite o primeiro numnero inteiro: ");
        int num1 = ler.nextInt();
        
        System.out.println("Digite o segundo numnero inteiro: ");
        int num2 = ler.nextInt();
        
        System.out.println("Digite o terceiro numnero inteiro: ");
        int num3 = ler.nextInt();
        
        int positivos = 0;
        
        if(num1 > 0) positivos++;
        if(num2 > 0) positivos++;
        if(num3 > 0) positivos++;
        
        if(positivos >= 2){
            System.out.println("Pelo menos dois numeros sao positivos!");
        }else{
            System.out.println("Menos de dois numeros sao positivos!");
        }
    }
    
}
