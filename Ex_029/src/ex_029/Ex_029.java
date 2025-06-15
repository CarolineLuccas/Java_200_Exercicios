/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex_029;

/**
 *029)Crie um programa que demonstre a diferença entre o pré-incremento
 (++variavel) e o pós-incremento (variavel++). Utilize exemplos práticos e exiba os resultados
 no console.

 * 
 * 
 * @author carol
 */
public class Ex_029 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int valorPrePos = 10;
        
        int preIncremento = ++valorPrePos;
        System.out.println("Apos pre-incremento (++valor): " + preIncremento);
        
        int posIncremento = valorPrePos++;
        System.out.println("Apos pos-incremento (valor++): " + posIncremento);
        
        System.out.println("Valor final apos pos-incremento: " + valorPrePos);
    }
    
}
