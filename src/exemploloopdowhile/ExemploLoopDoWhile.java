package exemploloopdowhile;

import javax.swing.JOptionPane;

/**
 *
 * @author Jeferson Leon
 */
public class ExemploLoopDoWhile {

    public static void main(String[] args) {

        int n, c;
        n = Integer.parseInt(JOptionPane.showInputDialog("Informe o número da tabuda:"));
        for (c = 1; c <= 10; c++) {

            if (c == 1) {
                System.out.println(" === TABUADA === ");
            }
            System.out.println(c + " x " + n + " = " + (c * n));

        }

        System.out.println("=== FIM DA TABUADA === ");

    }

}
