/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.edu.bsi.prog2.meuprimeiroaplicacao;

import java.util.Scanner;

/**
 *
 * @author erick
 */
public class MeuPrimeiroAplicacao {

    public static void main(String[] args) {
        float salario;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Insira o salário do funcionário :");
        salario = scan.nextFloat();
        
        System.out.println("O salário base de R$ " + salario + " com um aumento de 25% é " + ((salario * 0.25) + salario));
        System.out.println("Mais um teste");
    }    
}
