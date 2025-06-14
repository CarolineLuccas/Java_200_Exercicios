/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex_005;

/**
 *005)Desenvolva um programa que declare duas variáveis int e realize as operações
 * de soma, subtração, multiplicação, divisão e módulo entre elas. Exiba os resultados
 * de cada operação.
 * @author carol
 */
public class Ex_005 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 10;
        int b = 3;
        
        int soma = a + b;
        int subtracao = a - b;
        int multiplicacao = a * b;
        int divisao = a / b;
        int modulo = a % b;
        
        System.out.println("Soma: " + soma);
        System.out.println("Subtracao: " + subtracao);
        System.out.println("Multiplicacao: " + multiplicacao);
        System.out.println("Divisao: " + divisao);
        System.out.println("Modulo: " + modulo);
    }
    
}
