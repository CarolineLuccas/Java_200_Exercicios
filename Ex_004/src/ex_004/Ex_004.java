/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex_004;

/**
 *0004)Escreva um programa que converta um valor double em int e outro valor int 
 * em double. Exiba os resultados das conversões e explique a diferença entre 
 * conversão explícita e implícita. Dica: procure por type casting em Java
 * @author carol
 */
public class Ex_004 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double valorDouble = 9.99;
        
        int valorInt = (int) valorDouble;//Conversão explícita de double para int
        //Perde-se o valor decimal
        
        int numero = 10;
        double numeroConvertido = numero;//Conversão implícita de int para double
        //O valor é convertido sem perda de informação
        
        System.out.println("Valor double: " + valorDouble);
        System.out.println("Valor convertido para int: " + valorInt);
        System.out.println("Numero int: " + numero);
        System.out.println("Numero convertido para double: " + numeroConvertido);
    }
    
}
