package pkg18.j.programa.média;

import java.util.Scanner;

/**
 *
 * @author erikdmcosta
 */
public class JProgramaMédia {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Primeira nota: ");
        float num1 = teclado.nextFloat();
        System.out.print( "Segunda nota: ");
        float num2 = teclado.nextFloat();
        float media = (num1 + num1)/2;
        System.out.println("Sua média foi " + media);
        if (media > 9) {
            System.out.println("Parabéns!");
        }
    }
    
}
