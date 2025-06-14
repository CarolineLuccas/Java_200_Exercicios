/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex_024;

import java.util.Scanner;

/**
 *024)Crie um programa que leia um ano e verifique se ele é bissexto. Um ano é bissexto se for
 divisível por 4, mas não por 100, exceto se for divisível por 400.

 * 
 * @author carol
 */
public class Ex_024 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite um ano: ");
        int ano = ler.nextInt();
        
        if((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)){
            System.out.println("O ano eh bissexto!");
        }else{
            System.out.println("O ano nao eh bissexto!");
        }
    }
    
}
