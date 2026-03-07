/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.bsi.prog2.teste;

/**
 *
 * @author erick
 */
public class CalTaxa {
    public void calculadora(float valor, float taxa, int tempo, String tipoJuros){
        tipoJuros = tipoJuros.toUpperCase();
        taxa = taxa/100;
        if(tipoJuros.equals("JUROS SIMPLES") || tipoJuros.equals("SIMPLES")){
            System.out.println("Os juros SIMPLES do montante inicial de R$" + valor + " a uma taxa de " + (taxa)
            + "% por " + tempo + " meses, são de R$ " + (valor * (taxa/100)) + " já o montante final é de R$ " + ((valor * taxa * tempo) + valor));
        }
        else if(tipoJuros.equals("JUROS COMPOSTOS") || tipoJuros.equals("COMPOSTOS")){
            System.out.println("O montante final de Juros compostos são de " + valor * Math.pow((1 + taxa), tempo));
        }
        else{
            System.out.println("Deu algo errado, verifique o tipo de jutos");
        }
    }
}
