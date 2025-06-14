/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex_010;

/**
 *010)Desenvolva um programa que exiba o valor de uma variavel double com duas
 * casas decimais. Utilize formatação para garantir que o valor seja exibido corretamente
 * 
 * @author carol
 */
public class Ex_010 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double valor = 123.456789;
        
        System.out.printf("Valor formatado: %.2f%n", valor);
    }
    
}
