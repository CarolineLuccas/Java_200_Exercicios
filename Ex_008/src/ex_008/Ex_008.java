/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex_008;
import java.util.Scanner;

/**
 *Crie um programa que peça ao usuário para digitar seu nome e seu sobrenome. O 
 * programa deve exibir uma mensagem de boas-vindas concatenando o nome e o sobrenome
 * do usuário.
 * @author carol
 */
public class Ex_008 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite o seu nome: ");
        String nome = ler.nextLine();
        
        System.out.println("Digite o seu sobrenome: ");
        String sobrenome = ler.nextLine();
        
        String mensagem = "Bem-vindo, " + nome + " " + sobrenome + "!";
        System.out.println(mensagem);
    }
    
}
