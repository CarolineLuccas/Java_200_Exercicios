/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex_045;

import java.util.Scanner;

/**
 *045) Crie um programa que leia a idade de uma pessoa e classifique-a em uma das
seguintes categorias:
● 0 a 12: Criança
● 13 a 17: Adolescente
● 18 a 59: Adulto
● 60 ou mais: Idoso
Dica: Aqui veremos porque o switch case não funciona muito bem com intervalos de
valores, e o if deve ser a estrutura preferida.
 * 
 * @author carol
 */
public class Ex_045 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite sua idade: ");
        int idade = ler.nextInt();
        
        switch (idade){
            case 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12:
                System.out.println("Crianca");
                break;
            case 13, 14, 15, 16, 17:
                System.out.println("Adoloscente");
                break;
            case 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31,
            32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47,
            48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59:
                System.out.println("Adulto");
                break;
            default:
                System.out.println("Idoso");
        }
    }
    
}
