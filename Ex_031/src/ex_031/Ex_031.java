/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex_031;

import java.util.Scanner;

/**
 *031)Escreva um programa que leia um número inteiro e verifique se ele é positivo,
  negativo ou zero. Exiba uma mensagem apropriada para cada caso.

 * @author carol
 */
public class Ex_031 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in); 
        
        System.out.println("Digite um numero inteiro: ");
        int num = ler.nextInt();
        
        if(num > 0){
            System.out.println("O numero eh positivo!");
        }else if (num == 0){
            System.out.println("O numero eh o Zero!");
        }else{
            System.out.println("O numero eh negativo!");
        }
    }
    
}
