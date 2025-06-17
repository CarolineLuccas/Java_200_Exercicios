/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex_066;

import java.util.Scanner;

/**
 *066)Desenvolva um programa que leia 5 números inteiros do usuário, armazene-os
em um array e calcule a soma de todos os elementos.

 * 
 * @author carol
 */
public class Ex_066 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        int[] numeros = new int[5];
        int soma = 0;
        
        for (int i = 0; i < numeros.length; i++){
            System.out.println("Digite o numero " + (i + 1) + ": ");
            numeros[i] = ler.nextInt();//Le o numero do usuario e armazena no array
            soma += numeros[i];//soma esse numero a variável 'soma'
        }
        
        System.out.println("A soma dos elementos do array eh: " + soma);
    }
    
}
