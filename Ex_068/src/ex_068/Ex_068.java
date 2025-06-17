/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex_068;

import java.util.Scanner;

/**
 *068)Crie um programa que leia 8 números inteiros e exiba todos os valores pares
armazenados no array.

 * 
 * @author carol
 */
public class Ex_068 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        int[] numeros = new int[8];
        
        for (int i = 0; i < numeros.length; i++){
            System.out.println("Digite o numero " + (i + 1) + ": ");
            numeros[i] = ler.nextInt();
        }
        
        System.out.println("Numeros pares no array: ");
        for (int numero : numeros){
            if (numero % 2 == 0){
                System.out.println(numero);
            }
            /*
            O que está acontecendo?
Este é um laço "for-each", que percorre todos os elementos do array numeros.

🚀 Etapa por etapa:
1. for (int numero : numeros)
Esse comando significa:

"Para cada elemento do array numeros, copie seu valor para a variável numero e execute o bloco."

2. if (numero % 2 == 0)
Esse if verifica se o número é par:

% é o operador módulo (resto da divisão).

Se o resto da divisão de numero por 2 for igual a 0, então o número é par.

3. System.out.println(numero);
Se for par, o número é impresso no console.
            */
        }
    }   
}
