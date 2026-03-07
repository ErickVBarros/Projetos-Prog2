/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.edu.bsi.prog2.meuprimeiroswing;

import javax.swing.JOptionPane;

/**
 *
 * @author erick
 */
public class MeuPrimeiroSwing {

    public static void main(String[] args) {
        
        String nome = JOptionPane.showInputDialog("Digite um nome: ");
        System.out.println(nome);
        
        int resposta = JOptionPane.showConfirmDialog(null, 
                "Deseja continuar sr. " + nome + " ?");
        
        if (resposta == JOptionPane.YES_NO_OPTION) {
            JOptionPane.showMessageDialog(null, 
                    "Continuando...");
            
        }
        else{
            JOptionPane.showMessageDialog(null, 
                    "Acabou o swing",
                    "Bye, bye",
                    JOptionPane.ERROR_MESSAGE);
        }
        
        /*JOptionPane.showMessageDialog(null, "Hello World!");
        JOptionPane.showMessageDialog(null, "Você é burro ?????", "Programador", JOptionPane.QUESTION_MESSAGE);
        */
        /*1° Componente = É a página pai, onde vai aparecer a mensagem, no caso é null pq não tem nada anteriormente
//        2°= Mensagem que aparece
//        3°= Titulo que aparece
//        4 = Tipo de mensagem, ex: erro, questionamento, aviso.
        */
    }
}
