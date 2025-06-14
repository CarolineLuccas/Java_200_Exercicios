/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex_020;

import java.util.Scanner;

/**
 *020)Escreva um programa que leia um número inteiro e verifique se ele está entre 10 e 20
 (inclusive). Exiba uma mensagem informando se o número está dentro ou fora do intervalo
 * 
 * @author carol
 */
public class Ex_020 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite um numero inteiro: ");
        int num = ler.nextInt();
        
        if(num >= 10 && num <= 20){
            System.out.println("O numero esta dentro do intervalo de 10 a 20.");
        }else
        {
            System.out.println("O numero esta fora do intervalo!");
        }
    }
    
}
