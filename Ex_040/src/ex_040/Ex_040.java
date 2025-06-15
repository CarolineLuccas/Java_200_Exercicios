/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex_040;

import java.util.Scanner;

/**
 *040)Crie um programa que leia a velocidade de um veículo e exiba uma mensagem
 dizendo se o veículo está dentro do limite de velocidade (até 60 km/h), acima do limite
 (entre 61 km/h e 80 km/h) ou muito acima do limite (acima de 80 km/h)
 * 
 * @author carol
 */
public class Ex_040 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite a velocidade do veiculo em Km/h: ");
        double velocidade = ler.nextDouble();
        
        if(velocidade <= 60.0){
            System.out.println("Dentro do limite de velocidade.");
        }else if(velocidade > 60 && velocidade <= 80){
            System.out.println("Acima do limite.");
        }else{
            System.out.println("Muito acima do limite!");
        }
    }
    
}
