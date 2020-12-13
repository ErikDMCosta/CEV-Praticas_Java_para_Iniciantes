/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg16.g.operador.ternario.parte.pkg1;

/**
 *
 * @author erikdmcosta
 */ 
public class GOperadorTernarioParte1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1, n2, n3, n4, r, p, q, o, f, b;
        
        n1 = 4;
        n2 = 8;
        n3 = 14;
        n4 = 18;
        
        r = (n1 > n2)?0:1;
        p = (n3 > n2)?0:1;
        o = (n3>n2)?n3:n2;
        q = (n3>n4)?n3:n4;
        f = (n3>n4)?n3+n4:n3-n4;
        b = (n3>n2)?n3+n2:n3-n2;
        
        System.out.println(r);
        System.out.println(p);
        System.out.println(o);
        System.out.println(q);
        System.out.println(f);
        System.out.println(b);
    }
    
}
