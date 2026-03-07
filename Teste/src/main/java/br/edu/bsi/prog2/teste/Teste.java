/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.edu.bsi.prog2.teste;

import java.util.Scanner;

/**
 *
 * @author erick
 */
public class Teste {

    public static void main(String[] args) {
        /*
        float taxa, saldo;
        int tempo;
        String tipo;
        Scanner scanner = new Scanner(System.in);
        CalTaxa cal = new CalTaxa();
        CalTaxa cal2 = new CalTaxa();
        
        System.out.println("Digite o tipo de juros: ");
        tipo = scanner.nextLine();
        
        System.out.println("Digita o saldo inicial: ");
        saldo = scanner.nextFloat();
        
        System.out.println("Digita a taxa de juros: ");
        taxa = scanner.nextFloat();
        
        System.out.println("Digite o tempo: ");
        tempo = scanner.nextInt();
        
        cal.calculadora(saldo, taxa, tempo, tipo);
        
        cal2.calculadora(1000, 10, 2, "COMPOSTOS");
*/
        
        Orangotango oran = new Orangotango();
        Orangotango oran2 = new Orangotango("Pedro", "Guerreiro", "Verde");
        
        oran.setNome("Roger");
        oran.setClasse("Mágico");
        oran.setCor("Vermelho");
        
        oran.classeOrangotango();
        oran2.classeOrangotango();
    }
}
