/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg16.g.comparador.de.string.parte.pkg2;

/**
 *
 * @author erikdmcosta
 */
public class GComparadorDeStringParte2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nome1 = "Erik";
        String nome2 = "Erik";
        String nome3 = new String("Erik");
        String res1 , res2, eqls;
        res1 = (nome1==nome2)?"igual":"diferente";
        res2 = (nome1==nome3)?"igual":"diferente";
        eqls = (nome1.equals(nome3))?"igual":"diferente";
        System.out.println("A Estrutura é " + res1);
        System.out.println("\nA Estrutura é "  + res2);
        System.out.println("\nO Conteudo é " + eqls);
    }
    
}
