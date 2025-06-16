/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex_043;

import java.util.Scanner;

/**
 *043)Desenvolva um programa que leia dois números e um operador (+, -, *, /) e
realize a operação correspondente. Exiba o resultado no console
 * 
 * @author carol
 */
public class Ex_043 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite um numero ineiro");
        double num1 = ler.nextDouble();
        
        System.out.println("Digite um segundo ineiro");
        double num2 = ler.nextDouble();
        
        System.out.println("Digite o operador (+, -, *, /): ");
        char operador = ler.next().charAt(0);
        
        switch (operador){
            case '+':
                System.out.println("Resultado: "  + (num1 + num2));
                break;
            case '-':
                System.out.println("Resultado: " + (num1 - num2));
                break;
            case '*':
                System.out.println("Resultado: " + (num1 * num2));
                break;
            case '/':
                if(num2 != 0){
                    System.out.println("Resultado: " + (num1 / num2));
                }else{
                    System.out.println("Divisao por zero nao eh permitida!");
                }
                break;
            default:
                System.out.println("Operador invalido.");
        }
    }
    
}
