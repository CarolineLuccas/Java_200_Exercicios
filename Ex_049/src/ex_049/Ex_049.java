/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex_049;

/**
 *049)Escreva um programa que calcule a soma de todos os números de 1 a 100
 * 
 * @author carol
 */
public class Ex_049 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Soma de todos os numeros de 1 a 100");
        int soma = 0;
        
        for(int i=1; i <=100; i++){
          soma += i;  
        }
        
        System.out.println("A soma dos numeros de 1 a 100 eh: " + soma);
    }
    
}
