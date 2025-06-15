/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex_030;
import java.util.Scanner;

/*030)Escreva um programa que leia dois números inteiros do usuário e aplique
 operadores compostos (e.g., +=, -=, *=, /=, %=) para modificar o valor da primeira variável
 em relação à segunda. Exiba o resultado após cada operação.
 Dica: Use o Scanner para receber os números*
 *
 * @author carol
 */
public class Ex_030 {

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
        
        num1 += num2;
        System.out.println("Apos valor1 += valor2: " + num1);
        
        num1 -= num2;
        System.out.println("Apos valor1 -= valor2: " + num1);
        
        num1 *= num2;
        System.out.println("Apos valor1 *= valor2: " + num1);
        
        num1 /= num2;
        System.out.println("Apos valor1 /= valor2: " + num1);
        
        num1 %= num2;
        System.out.println("Apos valor1 %= valor2: " + num1);
    }
    
}
