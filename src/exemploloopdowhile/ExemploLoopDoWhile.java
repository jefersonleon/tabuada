package exemploloopdowhile;

import javax.swing.JOptionPane;

/**
 *
 * @author Jeferson Leon
 */
public class ExemploLoopDoWhile {

    public static void main(String[] args) {

        int n, c;
        c = 1;
        n = Integer.parseInt(JOptionPane.showInputDialog("Informe o número da tabuda:"));
        do {
            if (c == 1) {
                System.out.println(" === TABUADA === ");
            }
            System.out.println(c + " x " + n + " = " + (c * n));
            c++;
        } while (c <= 10);
        System.out.println("=== FIM DA TABUADA === ");
    }
}
