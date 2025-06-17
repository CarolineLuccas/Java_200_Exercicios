/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex_063;

import java.util.Scanner;

/**
 *063): Escreva um programa que peça ao usuário para digitar uma senha. Continue
pedindo a senha até que a senha correta seja digitada.
 * 
 * @author carol
 */
public class Ex_063 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        String senhaCorreta = "1234";
        String senhaDigitada;
        
        do{
            System.out.println("Digite a senha: ");
            senhaDigitada = ler.nextLine();
            if(!senhaDigitada.equals(senhaCorreta)){
                System.out.println("Senha incorreta. Tente novamente.");
            }  
        }while (!senhaDigitada.equals(senhaCorreta));
            System.out.println("Senha correta! Acessso concedido.");
    }
    
}
