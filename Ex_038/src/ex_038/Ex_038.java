/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex_038;

import java.util.Scanner;

/**
 *038)Desenvolva um programa que leia uma nota escolar (de 0 a 10) e classifique-a
 como "Insuficiente" (menor que 5), "Suficiente" (entre 5 e 7) ou "Bom" (maior que 7).

 * 
 * @author carol
 */
public class Ex_038 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite sua nota escolar de 0 a 10: ");
        double notaEscolar = ler.nextDouble();
        
        if(notaEscolar < 5){
            System.out.println("Classificacao: Insuficiente.");
        }else if(notaEscolar <= 7){
            System.out.println("Classificacao: Suficiente.");
        }else{
            System.out.println("Classificacao: Bom!");
        }
    }
    
}
