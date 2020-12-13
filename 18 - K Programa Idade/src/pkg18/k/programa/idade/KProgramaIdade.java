package pkg18.k.programa.idade;

import java.util.Calendar;
import java.util.Scanner;
/**
 *
 * @author erikdmcosta
 */
public class KProgramaIdade {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Seu ano de nascimento: ");
        int nascimento = teclado .nextInt();
        Calendar calendario = Calendar.getInstance();
        int anoatual = calendario.get(Calendar.YEAR);
        int idade = (anoatual - nascimento);
        System.out.println("Estamos no ano de "+ anoatual +" e a sua idade e de "+ idade + " anos.");
        if (idade >= 18) {
            System.out.println("Maior de Idade.");
        } else {
            System.out.println("Menor de Idade.");
        }
    }
}
