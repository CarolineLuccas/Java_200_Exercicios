/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex_042;

import java.util.Scanner;

/**
 *Crie um programa que leia uma nota de 0 a 10 e classifique a nota de acordo
com as seguintes categorias:
● 10: Excelente
● 8 e 9: Muito bom
● 6 e 7: Bom
● 5: Regular
● 0 a 4: Insuficiente
 * 
 * @author carol
 */
public class Ex_042 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite a nota de 0 a 10: ");
        int nota = ler.nextInt();
        
        switch (nota){
            case 10:
                System.out.println("Excelente");
                break;
            case 9:
            case 8:
                System.out.println("Muito Bom");
                break;
            case 7:
            case 6:
                System.out.println("Bom");
                break;
            case 5:
                System.out.println("Regular");
                break;
            case 4:
            case 3:
            case 2:
            case 1:
            case 0:
                System.out.println("Insuficiente");
                break;
            default:
                System.out.println("Nota invalida!");
        }
    }
    
}
