/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex_060;

import java.util.Scanner;

/**
 *060): Escreva um programa que leia números inteiros e exiba quantos desses
números são positivos. O programa deve parar quando o usuário digitar um número
negativo.
 * 
 * @author carol
 */
public class Ex_060 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        int contagemPositivos = 0;
        int numero;
        
        System.out.println("Digite um numero (negativo para parar): ");
        numero = ler.nextInt();
        
        while (numero >=0 ){
            if (numero > 0){
                contagemPositivos++;
            }
            System.out.println("Digite outro numero (negativo para parar): ");
            
            numero = ler.nextInt();
        }
        
        System.out.println("Quantidade de numeros positivos: " + contagemPositivos);
    }
    
}
