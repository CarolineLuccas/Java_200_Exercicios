/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex_034;

import java.util.Scanner;

/**
 *Escreva um programa que leia a idade de uma pessoa e exiba uma mensagem
 informando se ela é menor de idade (menor que 18 anos), maior de idade (18 anos ou mais)
 ou idosa (60 anos ou mais).
 * 
 * 
 * @author carol
 */
public class Ex_034 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite sua idade: ");
        int idade = ler.nextInt();
        
        if(idade >= 60){
            System.out.println("Voce eh idoso!");
        }else if (idade >= 18){
            System.out.println("Voce eh maior de idade!");
        }else{
            System.out.println("Voce eh menor de idade.");
        }
    }
    
}
