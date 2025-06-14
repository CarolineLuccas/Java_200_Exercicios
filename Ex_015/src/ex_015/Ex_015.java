/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex_015;
import java.util.Scanner;

/**
 *015)Escreva um programa que leia dois números inteiros do usuário e exiba o resultado da
  potenciação do primeiro número elevado ao segundo número (use o método Math.pow).
  Dica: pow recebe dois argumentos, o primeiro a base e o segundo o expoente
 * @author carol
 */
public class Ex_015 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite o numero da base: ");
        int base = ler.nextInt();
        
        System.out.println("Digite o expoente: ");
        int expoente =  ler.nextInt();
        
        double resultado = Math.pow(base, expoente);
        
        System.out.println("O resultado de " + base + "elevado a " + expoente + 
                " eh: " + resultado);
    }
    
}
