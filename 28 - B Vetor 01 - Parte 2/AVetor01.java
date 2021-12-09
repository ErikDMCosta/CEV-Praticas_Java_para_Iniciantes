package pkg28.a.vetor.pkg01;

/**
 *
 * @author erikdmcosta
 */
public class AVetor01 {

    public static void main(String[] args) {
        
        int n[] = {3, 2, 8, 7, 5, 4};
        
        // Metodos de vetores
        System.out.println("Total de casas de N é " + n.length+ "\n");
        
        // Laço para escrever o vetor na tela
        for (int c = 0; c <= 5; c++) {
                System.out.println("Na "+ c + "º posição o valor foi de " + n[c]);
        }
        
    }
    
}
