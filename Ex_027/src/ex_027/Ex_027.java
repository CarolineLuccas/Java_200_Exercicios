/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex_027;

/**
 *027)Escreva um programa que declare uma variavel inteira, aplique o operador de incremento (++)
 * e decremento (--), e exiba o valor da variável antes e depois de cada operação;
 * 
 * 
 * @author carol
 */
public class Ex_027 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero = 15;
        
        System.out.println("Valor inicial: " + numero);
        
        numero++;
        System.out.println("Apos incremento (++numero): " + numero);
        
        numero--;
        System.out.println("Apos decremento (--numero): " + numero);
    }
    
}
