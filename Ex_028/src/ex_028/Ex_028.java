/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex_028;

import java.util.Scanner;

/**
 *028)Desenvolva um programa que leia cinco numeros inteiros do usuario, um por
 * vez, e acumule a soma deles usando o operador de atribuicao +=. Exiba o total acumulado
 * ao final.
 * Dica: utilize o Scanner para pedir os dados, e você pode utilizar um loo´p for 
 * para repetir a solicitação de dados cinco vezes.
 * 
 * 
 * @author carol
 */
public class Ex_028 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        
        int somaAcumulada = 0;
        
        for(int i = 1; i<=5; i++){
            System.out.println("Digite o " + i + " numero inteiro: ");
            int valorDigitado = ler.nextInt();
            somaAcumulada += valorDigitado;
        }
        
        System.out.println("Soma acumulada: " + somaAcumulada);
    }
    
}
