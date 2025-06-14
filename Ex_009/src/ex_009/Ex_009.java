/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex_009;

/**
 *\009)Escreva um programa que declare variáveis locais e globais (dentro de uma 
 * classe). Inicialize e exiba o valor de ambas as variáveis no console. 
 * @author carol
 */
public class Ex_009 {

    /**
     * @param args the command line arguments
     */
    //Variável global
    static int variavelGlobal = 10;
    public static void main(String[] args) {
        // Variavel local
        int variavelLocal = 5;
        
        System.out.println("Valor da variavel Global: " + variavelGlobal);
         System.out.println("Valor da variavel Local: " + variavelLocal);
    }
    
}
