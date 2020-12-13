package pkg28.f.vetor.pkg03.parte.pkg1;

import java.util.Arrays;

/**
 *
 * @author erikdmcosta
 */
public class FVetor03Parte2 {

    public static void main(String[] args) {
        
        // For It  - - - Para Cada
        double v[] = {3.5, 2.75, 9, -4.5};
        
        // Colocando em ordem
        Arrays.sort(v);
        
        for (double valor: v) {
                System.out.print(valor + " ");
        }
    }
    
}
