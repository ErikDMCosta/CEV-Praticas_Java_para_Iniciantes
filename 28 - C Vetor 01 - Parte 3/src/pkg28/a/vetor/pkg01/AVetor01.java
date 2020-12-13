package pkg28.a.vetor.pkg01;

/**
 *
 * @author erikdmcosta
 */
public class AVetor01 {

    public static void main(String[] args) {
        
        int n[] = {3, 2, 8, 7, 5, 4};

        // Laço para escrever o vetor na tela junto com metodos de vetores length (contador)
        for (int c = 0; c <= n.length-1; c++) {
                System.out.println("Na "+ c + "º posição o valor foi de " + n[c]);
        }
        
    }
    
}
