/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex_037;

import java.util.Scanner;

/**
 *037)Escreva um programa que leia a temperatura atual em graus Celsius e exiba
 uma mensagem dizendo se o clima está "Frio" (abaixo de 15ºC), "Agradável" (entre 15ºC e
 30ºC) ou "Quente" (acima de 30ºC).
 * 
 * @author carol
 */
public class Ex_037 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite a temperatura em graus Celsius: ");
        double temperatura = ler.nextDouble();
        
        if(temperatura < 15.0){
            System.out.println("O clima esta frio!");
        }else if(temperatura >= 15.0 && temperatura <= 30.0){
            System.out.println("O clima esta agradavel.");
        }else{
            System.out.println("O clima esta quente!");
        }
    }
    
}
