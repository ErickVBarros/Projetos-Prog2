/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.bsi.prog2.teste;

/**
 *
 * @author erick
 */
public class Orangotango {
    private String nome;
    private String classe;
    private String cor;

    public Orangotango(){};
    public Orangotango(String nome, String classe, String cor) {
        this.nome = nome;
        this.classe = classe;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    } 
    
    public void classeOrangotango(){
        System.out.println("Orangotango " + this.nome + " da classe " + this.classe + " com a cor " + this.cor);
    }
}
