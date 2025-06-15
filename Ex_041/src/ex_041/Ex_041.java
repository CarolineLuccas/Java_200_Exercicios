/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex_041;

import java.util.Scanner;

/**
 *041)Escreva um programa que leia um número inteiro de 1 a 7 e exiba o nome do
 dia da semana correspondente (1 para domingo, 2 para segunda-feira, etc.).
 * 
 * @author carol
 */
public class Ex_041 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite o numero do dia da semana: ");
        int diaSemana = ler.nextInt();
        
        switch (diaSemana){
            case 1:
                System.out.println("Domingo");
                break;
            case 2: 
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terca-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Numero invalido! Digite um numero de 1 a7");
        }
    }
    
}
