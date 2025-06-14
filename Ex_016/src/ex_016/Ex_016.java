/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex_016;
import java.util.Scanner;

/**
 *016)Crie um programa que leia dois números inteiros e exiba se o primeiro é maior, menor ou
  igual ao segundo.
 * 
 * @author carol
 */
public class Ex_016 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite o primeiro numero inteiro: ");
        int num1 = ler.nextInt();
        
        System.out.println("Digite o segundo numero inteiro: ");
        int num2 = ler.nextInt();
        
        System.out.println("Os numeros digitados foram: " + num1 + " e " + num2);
        
        if(num1 > num2){
            System.out.println("O primneiro numero eh maior do que o segundo.");
        }else if(num1 < num2){
            System.out.println("O primeiro numero eh menor do que o segundo.");
        }else{
            System.out.println("Os dois numeros sao iguais");
        }
    }
    
}
