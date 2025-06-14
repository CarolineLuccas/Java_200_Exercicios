/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex_007;
import java.util.Scanner;

/**
 *007)Escreva um programa que leia um número inteiro e um número decimal do 
 * teclado e, em seguida, exiba a soma desses numeros no console
 * @author carol
 */
public class Ex_007 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite um numero inteiro: ");
        int numeroInt = ler.nextInt();
        
        System.out.println("Digite o numero decimal: ");
        double numeroDouble = ler.nextDouble();
        
        double soma = numeroInt + numeroDouble;
        System.out.println("A soma dos numeros eh: " + soma);
    }
    
}
