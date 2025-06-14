/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex_013;

import java.util.Scanner;

/**
 *Desenvolva um programa que leia a largura e a altura de um retângulo 
 * e calcule sua área. Exiba o resultado no console.
 * @author carol
 */
public class Ex_013 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite a largura do retangulo: ");
        double largura = ler.nextDouble();
        
        System.out.println("Digite a altura do retangulo: ");
        double altura = ler.nextDouble();
        
        double area = largura * altura;
        
        System.out.println("A area do retangulo eh: " + area + " metros quadrados");
        
        
        
    }
    
}
