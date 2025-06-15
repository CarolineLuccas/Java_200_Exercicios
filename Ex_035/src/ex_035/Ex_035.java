/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex_035;

import java.util.Scanner;

/**
 *035): Crie um programa que leia uma nota de 0 a 100 e exiba uma mensagem de
 aprovação se a nota for maior ou igual a 60. Caso contrário, exiba uma mensagem de
 reprovação.
 * @author carol
 */
public class Ex_035 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite a nota de 0 a 100: ");
        int nota = ler.nextInt();
        
        if(nota >= 60){
            System.out.println("Voce esta aprovado!");
        }else{
            System.out.println("Voce esta reprovado!");
        }
    }
    
}
