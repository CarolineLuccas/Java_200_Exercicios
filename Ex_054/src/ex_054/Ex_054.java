/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex_054;

/**
 *054)Desenvolva um programa que conte quantos números entre 1 e 100 são
múltiplos de 3.
 * 
 * @author carol
 */
public class Ex_054 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Contagem de multiplos de 3 entre 1 e 100: ");
        int contagem = 0;
        for(int i = 1; i <= 100; i++){
            if(i % 3 == 0){
                contagem++;
            }
        }
        System.out.println("\nQuantidade de multiplos entre 1 e 100: " + contagem);
    }
    
}
