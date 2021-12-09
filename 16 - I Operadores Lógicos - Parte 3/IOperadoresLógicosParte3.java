/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg16.i.operadores.lógicos.parte.pkg3;

/**
 *
 * @author erikdmcosta
 */
public class IOperadoresLógicosParte3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x, y, z;
        x = 4;
        y = 7;
        z = 12;
        boolean r, q, p, k, l;
        r = (x<y && y<z)?true:false;
        q = (x<y && y==z)?true:false;
        p = (x<y || y==z)?true:false;
        k = (x<y ^ y==z)?true:false;
        l = (x<y ^ y<z)?true:false;
        System.out.println("(x<y && y<z) <- " + r);
        System.out.println("\n(x<y && y==z) <- " + q);
        System.out.println("\n(x<y || y==z) <- " + p);
        System.out.println("\n(x<y ^ y==z) <- " + k);
        System.out.println("\n(x<y ^ y<z) <- " + l);
    }
    
} 
