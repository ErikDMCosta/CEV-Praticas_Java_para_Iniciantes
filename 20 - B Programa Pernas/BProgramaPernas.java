package pkg21.b.programa.pernas;

import java.util.Scanner;

/**
 *
 * @author erikdmcosta
 */
public class BProgramaPernas {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Qualtas pernas? ");
        int perna = teclado.nextInt();
        String tipo;
        System.out.print("Isso é um(a) ");
        switch (perna) {
            case 1:
                tipo = "Saci";
                break;
            case 2:
                tipo = "Bipede";
                break;
            case 3:
                tipo = "Tripé";
                break;
            case 4:
                tipo = "Quadrúpede";
                break;           
            case 6:
                tipo = "Aranha";
                break;
            default:
                tipo = "ET";
                break;
        }
        System.out.println(tipo + " .");
    }
    
}
