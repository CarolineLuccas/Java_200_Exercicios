/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex_057;

/**
 *057)Escreva um programa que some todos os números pares de 1 a 100 e,
separadamente, todos os números ímpares de 1 a 100.
 * 
 * @author carol
 */
public class Ex_057 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int somaPares = 0, somaImpares = 0;
        
        for(int i = 1; i <= 100; i++){
            if(i % 2 == 0){
                somaPares += i;
            }else{
                somaImpares += i;
            }
        }
        
        System.out.println("Soma dos numeros pares: " + somaPares);
        System.out.println("Soma dos numeros Impares: " + somaImpares);
    }
    
}
