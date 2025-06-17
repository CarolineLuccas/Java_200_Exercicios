/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex_065;

/**
 *065)Crie um programa que declare um array de 5 números inteiros. Atribua valores
a esse array e, em seguida, exiba os valores no console.

 * 
 * @author carol
 */
public class Ex_065 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] numeros = {10, 20, 30, 40, 50};
        
        for(int i = 0; i < numeros.length; i++){
            System.out.println("Elemento " + i + ": " + numeros[i]);
        }
    }
    
}
