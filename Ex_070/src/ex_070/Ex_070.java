/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex_070;

import java.util.Scanner;

/**
 *070)Escreva um programa que leia 15 números inteiros e, em seguida, exiba
quantos desses números são positivos e quantos são negativos.
 * 
 * @author carol
 */
public class Ex_070 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        int[] numeros = new int[15];
        int positivos = 0, negativos = 0;
        
        for ( int i = 0; i < numeros.length; i++){
            System.out.println("Digite o numero " + (i + 1) + ":");
            numeros[i] = ler.nextInt();
        }
        
        for (int numero: numeros){
            if (numero > 0){
                positivos++;
            }else if (numero < 0){
                negativos++;
            }
        }
        
        System.out.println("Quantidade de numeros positivos: " + positivos);
        System.out.println("Quantidade de numeros negativos: " + negativos);
    }
    
}
