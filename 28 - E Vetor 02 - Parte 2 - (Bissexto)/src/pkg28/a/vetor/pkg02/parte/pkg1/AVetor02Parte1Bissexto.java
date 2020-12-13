package pkg28.a.vetor.pkg02.parte.pkg1;

import java.util.Calendar;

/**
 *
 * @author erikdmcosta
 */
public class AVetor02Parte1Bissexto {

    public static void main(String[] args) {
        
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-="+ "\n");
        String mes[] = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Set", "Out", "Nov", "Dez"};
        int tot[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        Calendar cal = Calendar.getInstance();
        int anoatual = cal.get(Calendar.YEAR);
        
        for (int i = 0; i < mes.length; i++) {
                System.out.println("O mês tem " + mes[i] + " e tem " + tot[i] + " dias ao todo.");
        }
        System.out.println("\n" + "=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=");
        if (anoatual % 400 == 0) {
                System.out.println("      O ano de " + anoatual + " é bissexto.");
        } else if ((anoatual % 4 == 0) && (anoatual % 100 != 0)) {
                System.out.println("      O ano de " + anoatual + " é bissexto.");
        } else {
                System.out.println("      O ano de " + anoatual +" não é bissexto.");
        }    
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=");
    }
    
}
