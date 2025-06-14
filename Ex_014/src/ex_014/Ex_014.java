/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex_014;
import java.util.Scanner;

/**
 *
 * @author carol
 */
public class Ex_014 {

    /**
     * 014)Crie um programa que converta uma temperatura em graus Celsius para
     * Fahrenheit. A  formula de conversao eh F = (C*9/5)+32. Exiba o resultado no console
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite a temperatura em graus Celsius: ");
        double celsius = ler.nextDouble();
        
        double fahrenheit = (celsius * 9/5) + 32;
        
        System.out.println("A temperatura em Fahrenheit eh: " + fahrenheit);
    }
    
}
