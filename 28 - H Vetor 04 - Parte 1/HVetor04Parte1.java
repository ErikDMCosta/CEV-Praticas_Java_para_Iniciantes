package pkg28.h.vetor.pkg04.parte.pkg1;

import java.util.Arrays;

/**
 *
 * @author erikdmcosta
 */
public class HVetor04Parte1 {

    public static void main(String[] args) {
        //
        int vet[] = {3, 7, 6, 1, 9, 4, 2};
        // Pesquisa posição em um vetor e armazena o valor selecionado na variavel "p"
        int p = Arrays.binarySearch(vet, 1);
        // Mostrar p vetor na tela
        for (int v : vet){
                System.out.print(v + " ");
        }
        // Não tem o valor 8
        // - 8 sendo negativo pois o valor não existe na no vetor
        // Todo valor que o método (.binarySearch) encontrar como negativo e por que não existe o valor no vetor
        int r = Arrays.binarySearch(vet, 8);
        
        // Escrevendo na tela
        System.out.println("\n" + "Encontrei o valor na posição "+ p);
        System.out.println("\n" + "Encontrei o valor na posição "+ r); 
        
    }
    
}
