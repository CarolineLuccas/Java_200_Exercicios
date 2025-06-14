/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex_006;

/**
 *006)Crie um programa que utilize a palavra-chave final para declarar uma 
 * constante que representa a velocidade da luz no vácuo. Tente alterar o valor da constante
 * e observe o comportamento do compilador
 * @author carol
 */
public class Ex_006 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // A constante foi declarada com a palavra-chave final
        //A sua modificação é impedida após a sua inicialização
        final double VELOCIDADE_DA_LUZ = 299792458;// em metros por segundo
        
        System.out.println("Velocidade da luz: " + VELOCIDADE_DA_LUZ + "m/s");
        
        //VELOCIDADE_DA_LUZ = 300000000; //Esta linha causará um erro de compilação
        //Constante não pode ser modificada após sua inicialização
        //Conceito de imutabilidade associado às constantes em Java
    }
    
}
