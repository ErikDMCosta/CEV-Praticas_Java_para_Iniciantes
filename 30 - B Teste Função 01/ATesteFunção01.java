package pkg30.a.teste.função.pkg01;

/**
 *
 * @author erikdmcosta
 */
public class ATesteFunção01 {
    
        static int soma( int a, int b ) { // Em vez do ( void ) fica então ( int )
                int s = a + b;
                return s; // Com o retorno ele espera a função INTEGER ( int )
    }

        public static void main(String[] args) {
                System.out.println("Comecçou o programa");
                int sm = soma(5,2);
                System.out.println("A soma vale " + sm);
        
    }
    
}
