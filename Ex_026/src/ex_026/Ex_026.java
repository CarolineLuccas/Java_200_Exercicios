/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex_026;

/**
 *026)Crie um programa que declare uma variável inteira, atribua um valor a ela e,
 * em seguida, modifique o valor utilizando os operadores de atribuição (+=, -=, *=, /=, %=).
 * Exiba o resultado após cada operação.
 * 
 * @author carol
 */
public class Ex_026 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int valor = 10;
        
        System.out.println("Valor inicial: " + valor);
        
        valor += 5;
        System.out.println("Apos valor += 5: " + valor);
        
        valor -= 3;
        System.out.println("Apos valor -= 3: " + valor);
        
        valor *= 2;
        System.out.println("Apos valor *= 2: " + valor);
        
        valor /= 4;
        System.out.println("Apos valor /= 4: " + valor);
        
        valor %= 3;
        System.out.println("Apos valor %= 3: " + valor);
    }
    
}
