/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex_017;
import java.util.Scanner;

/**
 *Escreva um programa que leia um número inteiro e exiba se ele é par ou ímpar.
 Dica: Você pode utilizar a divisão de resto, com o operador %.

 * 
 * @author carol
 */
public class Ex_017 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite o um numero inteiro: ");
        int numInt = ler.nextInt();
        
        if(numInt % 2 == 0){
            System.out.println("O numero eh par. ");
        }else{
            System.out.println("O numero eh impar.");
        }
    }
    
}
