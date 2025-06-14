/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex_021;

import java.util.Scanner;

/**
 *021)Desenvolva um programa que leia duas strings do usuário e verifique se elas são iguais.
 Exiba uma mensagem informando o resultado da comparação.
 * 
 * @author carol
 */
public class Ex_021 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite uma palavra: ");
        String string1 = ler.nextLine();
        
        System.out.println("Digite outra palavra: ");
        String string2 = ler.nextLine();
        
        if(string1.equals(string2)){
            System.out.println("As palavras sao iguais!");
        }else{
            System.out.println("As palavras sao diferentes!");
        }
    }
    
}
