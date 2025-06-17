/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex_069;

import java.util.Scanner;

/**
 *Desenvolva um programa que leia 10 números inteiros e armazene-os em um
array. Encontre e exiba o menor e o maior valor presentes no array.
 * 
 * @author carol
 */
public class Ex_069 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        int[] numeros = new int[10];
        int maior, menor;
        
        for (int i = 0; i < numeros.length; i++){
            System.out.println("Digite o numero " + (i + 1) + ": ");
            numeros[i] = ler.nextInt();
        }
        
        maior = menor = numeros[0];
        
        for (int numero : numeros){
            if (numero > maior){
                maior = numero;
            }
            if (numero < menor){
                menor = numero;
            }
        }
        
        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);
    }
    
}
