package pkg28.a.vetor.pkg02.parte.pkg1;

/**
 *
 * @author erikdmcosta
 */
public class AVetor02Parte1 {

    public static void main(String[] args) {
        String mes[] = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Set", "Out", "Nov", "Dez"};
        int tot[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        for (int i = 0; i < mes.length; i++) {
                System.out.println("O mês tem " + mes[i] + " e tem " + tot[i] + " dias ao todo.");
        }
        
    }
    
}
