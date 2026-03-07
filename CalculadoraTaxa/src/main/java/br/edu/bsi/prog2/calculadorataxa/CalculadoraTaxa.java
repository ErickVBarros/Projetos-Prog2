/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.edu.bsi.prog2.calculadorataxa;
import java.util.Scanner;

/**
 *
 * @author erick
 */
public class CalculadoraTaxa {

    public static void main(String[] args) {
        float deposito, taxa;
        int tempo;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Informe o valor do deposito: ");
        deposito = scan.nextFloat();
        
        System.out.println("Informe o valor da taxa de juros: ");
        taxa = (scan.nextFloat())/100;
        
        System.out.println("Informe o tempo da aplicação em meses: ");
        tempo = scan.nextInt();
        
        System.out.println("Total de Juros R$ " + (deposito * taxa * tempo));
        System.out.println("O Montante total R$ " + ((deposito * taxa * tempo) + deposito));
    }
}
