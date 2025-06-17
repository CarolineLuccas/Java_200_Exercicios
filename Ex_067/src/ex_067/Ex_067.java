/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex_067;

import java.util.Scanner;

/**
 *067)Escreva um programa que leia 10 números inteiros e calcule a média dos
valores inseridos, utilizando um array para armazenar os números.
 * 
 * @author carol
 */
public class Ex_067 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        int[] numeros = new int[10];//\cria um array com 10 posicoes
        int soma = 0;
        
        for (int i = 0; i< numeros.length; i++){
            System.out.println("Digite o numero " + (i + 1) + ": ");
            numeros[i] = ler.nextInt();
            soma += numeros[i];//Soma todos os valores digitados pelo usuario
        }
        
        double media = soma / (double) numeros.length;// calcula a media real, com casas decimais
        System.out.println("A media dos valores eh: " + media);
    }
    
}
