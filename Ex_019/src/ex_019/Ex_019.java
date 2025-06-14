/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex_019;

import java.util.Scanner;

/**
 *Crie um programa que leia a idade de uma pessoa e verifique se ela é elegível para votar
 (idade igual ou superior a 18 anos).
 * 
 * @author carol
 */
public class Ex_019 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite sua idade: ");
        int idade = ler.nextInt();
        
        if(idade >= 18){
            System.out.println("Voce pode votar!");
        }else
        {
            System.out.println("Voce nao esta apto para votar ainda!");
        }
    }
    
}
