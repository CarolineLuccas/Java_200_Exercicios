/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex_058;
import java.util.Scanner;

/**
 *058) Crie um programa que leia um número inteiro entre 1 e 10. Caso o valor seja
inválido, continue pedindo a entrada até que um número válido seja fornecido.
 * 
 * @author carol
 */
public class Ex_058 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        System.out.println("Validacao de entrada While: ");
        
        System.out.println("Digite um numero entre 1 e 10: ");
        int numero = ler.nextInt();
        
        while(numero < 1 || numero > 10){
            System.out.println("Numero Invalido. Tente Novamente");
            System.out.println("Digite um numero entre 1 e 10: ");
            numero = ler.nextInt();
        }
        System.out.println("Numero valido: " + numero);
    }
    
}
