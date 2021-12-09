package pkg25.c.exercício.repita;

import javax.swing.JOptionPane;

/**
 *
 * @author erikdmcosta
 */
public class DExercícioRepita {

        public static void main(String[] args) {
            // TODO code application logic here
                int n, s = 0;
                do {
                        n = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>Informe um número:  <br><em>(valor 0 interrompe)</em></html>"));
                        s += n;
                } while (n != 0);
                JOptionPane.showMessageDialog(null, "<html>Resultado final <hr>" + " <br>Somatória vale " + s + "</html>");
        }
    
}
