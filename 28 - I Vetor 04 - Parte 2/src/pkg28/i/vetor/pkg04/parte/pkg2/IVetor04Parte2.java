package pkg28.i.vetor.pkg04.parte.pkg2;

import java.util.Arrays;

/**
 *
 * @author erikdmcosta
 */
public class IVetor04Parte2 {

        public static void main(String[] args) {
                // Criando um vetor e preenchendo o vetor com um unico valor ( 8 )
                int v[] = new int[20];
                Arrays.fill(v, 0);
                for (int valor : v) {
                        System.out.print(valor + " "); // Montra as 20 posições do vetor ( v ) mostrando que todas foram preenchidas com zero.
                }
                System.out.println("\n");
        }
    
}
