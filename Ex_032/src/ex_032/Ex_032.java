/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex_032;

import java.util.Scanner;

/**
 *032)Enunciado: Crie um programa que leia um número inteiro e exiba se o número é par ou
 ímpar.
 * 
 * @author carol
 */
public class Ex_032 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite um numero inteiro: ");
        int numero = ler.nextInt();
        
        if(numero % 2 == 0){
            System.out.println("O numero eh par!");
        }else{
            System.out.println("O numero eh impar!");
        }
    }
    
}
