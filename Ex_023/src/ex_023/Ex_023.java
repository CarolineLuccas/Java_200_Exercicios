/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex_023;

import java.util.Scanner;

/**
 *023)Escreva um programa que leia a idade de três pessoas e verifique se pelo menos duas
 delas são maiores de idade (18 anos ou mais).
 * 
 * @author carol
 */
public class Ex_023 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite a idade da primeira pessoa: ");
        int idade1 = ler.nextInt();
        
        System.out.println("Digite a idade da segunda pessoa: ");
        int idade2 = ler.nextInt();
        
         System.out.println("Digite a idade da terceira pessoa: ");
        int idade3 = ler.nextInt();
        
        int maiorIdade = 0;
        
        if(idade1 >= 18) maiorIdade++;
        if(idade2 >= 18) maiorIdade++;
        if(idade3 >= 18) maiorIdade++;
        
        if(maiorIdade >= 2){
            System.out.println("Pelo menos duas pessoas sao maiores de idade.");
        }else{
            System.out.println("Menos de duas pessoas sao maiores de idade.");
        }
    }
    
}
