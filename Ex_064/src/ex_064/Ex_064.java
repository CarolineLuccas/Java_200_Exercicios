/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex_064;

import java.util.Scanner;

/**
 *064)Crie um programa que exiba um menu de opções e permita ao usuário
escolher uma ação (como somar dois números, subtrair, etc.). O menu deve continuar
sendo exibido até o usuário escolher a opção de sair.
 * 
 * @author carol
 */
public class Ex_064 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        int opcao;
        
        do{
            System.out.println("Menu de Opcoes: ");
            System.out.println("1. Somar dois numeros");
            System.out.println("2. Subtrair dois numeros");
            System.out.println("3. Multiplicar dois numeros");
            System.out.println("4. Dividir dois numeros");
            System.out.println("5. Sair");
            System.out.println("Escolha uma opcao: ");
            opcao = ler.nextInt();
            
            if(opcao >= 1 && opcao <= 4){
                System.out.println("Digite o primeiro numero: ");
                double num1= ler.nextDouble();
                System.out.println("Digite o segundo numero: ");
                double num2 = ler.nextDouble();
                
                switch (opcao){
                    case 1:
                        System.out.println("Resultado: " + (num1 + num2));
                        break;
                    case 2:
                        System.out.println("Resultado: " + (num1 - num2));
                        break;
                    case 3:
                        System.out.println("Resultado: " + (num1 * num2));
                        break;
                    case 4:
                        if(num2 != 0){
                            System.out.println("Resultado: " + (num1 / num2));
                        }else{
                            System.out.println("Erro: Divisao por zero nao eh permitida.");
                        }
                        break;
                }
            }else if (opcao != 5){
                System.out.println("Opcao invalida. Tente novamente.");
            }
            System.out.println();
        }while (opcao != 5);
        
        System.out.println("Programa encerrado.");
    }
    
}
