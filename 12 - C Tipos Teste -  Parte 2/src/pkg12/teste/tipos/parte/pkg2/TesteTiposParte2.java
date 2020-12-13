/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg12.teste.tipos.parte.pkg2;

import static java.lang.Integer.parseInt;

/**
 *
 * @author erikdmcosta
 */
public class TesteTiposParte2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        *   int idade = 30;
        *   String valor = Integer.toString(idade);
        *   System.out.println(valor);
        **/
        String valor = "30.5";
        float idade = Float.parseFloat(valor);
        System.out.printf("%.3f",idade);
    }
    
}
