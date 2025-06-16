/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex_044;

import java.util.Scanner;

/**
 *044) Escreva um programa que leia um número de 1 a 4 e exiba o nome da estação
do ano correspondente:
● 1: Verão
● 2: Outono
● 3: Inverno
● 4: Primavera

 * 
 * @author carol
 */
public class Ex_044 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite um numero de 1 a 4 para a estacao do ano: ");
        int estacao = ler.nextInt();
        
        switch (estacao){
            case 1:
                System.out.println("Verao");
                break;
            case 2:
                System.out.println("Outono");
                break;
            case 3:
                System.out.println("Inverno");
                break;
            case 4:
                System.out.println("Primavera");
                break;
            default:
                System.out.println("Numero invalido. Digite um numero de 1 a 4.");
        }
    }  
}
