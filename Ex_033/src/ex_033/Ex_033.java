/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex_033;

import java.util.Scanner;

/**
 *033)Desenvolva um programa que leia o valor de uma compra e aplique um
 desconto de 10% se o valor for superior a R$100,00. Exiba o valor final com ou sem
 desconto.

 * 
 * @author carol
 */
public class Ex_033 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite o valor de compra: ");
        double valor = ler.nextDouble();
        
        if(valor > 100.00){
            valor *= 0.90;
            System.out.println("Desconto aplicado! Valor final: R$ " + valor);
        }else{
            System.out.println("Sem desconto. Valor finsl: R$ " + valor);
        }
    }
    
}
