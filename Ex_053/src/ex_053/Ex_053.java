/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex_053;
import java.util.Scanner;

/**
 *053)Crie um programa que leia 5 números inteiros do usuário e calcule a média
deles.

 * 
 * @author carol
 */
public class Ex_053 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        int soma = 0;
        
        System.out.println("Calculo da media de cinco numeros inteiros: ");
        for(int i = 1; i <= 5; i++){
            System.out.println("Digite o numero " + i + ":");
            int numero = ler.nextInt();
            soma += numero;
        }
        
        double media = soma/5.0;
        System.out.println("A media eh: " + media);
    }
    
}
