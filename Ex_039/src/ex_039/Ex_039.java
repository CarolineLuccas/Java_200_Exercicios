/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex_039;

import java.util.Scanner;

/**
 *039)Escreva um programa que leia as idades de duas pessoas e exiba quem é
 mais velho. Caso as idades sejam iguais, exiba uma mensagem informando que as duas
 pessoas têm a mesma idade.

 * 
 * @author carol
 */
public class Ex_039 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite a primeira idade: ");
        int idade1 = ler.nextInt();
        
        System.out.println("Digite a segunda idade: ");
        int idade2 = ler.nextInt();
        
        if(idade1 > idade2){
            System.out.println("A primeira pessoa eh a mais velha. ");
        }else if (idade1 < idade2){
            System.out.println("A segunda pessoa eh a mais velha.");
        }else {
                System.out.println("Ambas tem a mesma idade");
        }
    }
    
}
