/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex_056;

/**
 *056)Crie um programa que calcule o produto dos números inteiros de 1 a 10
 * 
 * @author carol
 */
public class Ex_056 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int produto = 1;
        
        for(int i = 1; i <= 10; i++){
            produto *= i;
        }
        System.out.println("O produto dos numeros de 1 a 10 eh: " + produto);
    }
    
}
