/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex_048;

/**
 *048)Desenvolva um programa que exiba todos os números pares de 1 a 20.
 * 
 * @author carol
 */
public class Ex_048 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Numeros pares de 1 a 20");
        
        for(int i=0; i<=20; i++){
            if(i%2 == 0){
                System.out.println(i);
            }
        }
    }
    
}
