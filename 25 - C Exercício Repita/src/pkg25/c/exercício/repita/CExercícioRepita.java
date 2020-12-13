package pkg25.c.exercício.repita;

import javax.swing.JOptionPane;

/**
 *
 * @author erikdmcosta
 */
public class CExercícioRepita {

    public static void main(String[] args) {
        // TODO code application logic here
        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número: "));
        JOptionPane.showMessageDialog(null, "Você digitou o valor " + n);
    }
    
}
