package pkg25.c.exercício.repita;

import javax.swing.JOptionPane;

/**
 *
 * @author erikdmcosta
 */
public class EExercícioRepita {

        public static void main(String[] args) {
            // TODO code application logic here
                int numero, soma = 0;
                int contagem = 0;
                int par = 0;
                int impar = 0;
                int maiorcem = 0;
                float media = 0;
                do {
                        numero = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>Informe um número:  <br><em>(valor 0 interrompe)</em></html>"));
                        soma += numero;
                        contagem++;
                        media = soma / 2;
                                if (numero % 2 == 0) {
                                        par++;
                        
                                } else {
                                        impar++;
                                }
                        if (numero > 100) {
                                maiorcem++;
                        }
                } while (numero != 0);
                contagem--;
                JOptionPane.showMessageDialog(null, "<html>Resultado final <hr>"
                        + "<br>Somatória vale: " + soma
                        + "<br>Total de Valores: " + contagem
                        + "<br>Total de Pares: " + par
                        + "<br>Total de Ímpares: " + impar
                        + "<br>Acima de 100: " + maiorcem
                        + "<br>Média dos valores: " + media        
                        + "</html>");
        }
    
}
