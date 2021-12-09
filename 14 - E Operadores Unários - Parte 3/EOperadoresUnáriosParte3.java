/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg14.e.operadores.unários.parte.pkg3;

/**
 *
 * @author erikdmcosta
 */
public class EOperadoresUnáriosParte3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero1 = 5;
        int numero2 = 5;
        System.out.println("Primeiro nº " + numero1 + " Segundo nº " + numero2);
        
        numero1++;
        numero2--;
        
        int num1 = 5;
        int num2 = 5; 
        
        int valor1 = 5 + ++num1;
        int valor2 = 5 + num2++;
        
        System.out.println("Com ++ " + numero1);
        System.out.println("Com -- " + numero2);
        
        System.out.println("Com ++ no inicio 1º valor " + valor1);
        System.out.println("Com ++ no final 2º valor " + valor2);
        
        int x = 4;
        x += 2;
        System.out.println(" += " + x);
        
        int y = 4;
        x *= 2;
        System.out.println(" *= " + y);
        
        float v = 8.3f;
        int ar = (int) Math.floor(v);
        System.out.println("8.3 arrendodado para cima e igual a " + ar);
        
        float z = 8.3f;
        int al = (int) Math.ceil(z);
        System.out.println("8.3 arrendodado para baixo e igual a " + al);
        
        float c = 8.5f;
        int ap = (int) Math.round(c);
        System.out.println("8.3 arrendondo aritiméticamente e igual a " + ap);
        
    }
    
}
