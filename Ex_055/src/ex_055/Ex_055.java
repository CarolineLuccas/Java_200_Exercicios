/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex_055;

/**
 * 055)Escreva um programa que exiba os primeiros 10 termos da sequência de
Fibonacci.

 * 
 * @author carol
 */
public class Ex_055 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int termo1 = 0, termo2 = 1;
        
        System.out.println("Primeiros 10 termos da sequencia de Fibonacci: ");
        
        System.out.print(termo1 + " " + termo2 + " " );
        
        for(int i = 3; i <= 10; i++){
            int proximoTermo = termo1 + termo2;
            System.out.print(proximoTermo + " ");
            termo1 = termo2;
            termo2 = proximoTermo;
        }
    }
    
}
