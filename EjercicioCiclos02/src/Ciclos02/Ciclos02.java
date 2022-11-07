/*

 */
package Ciclos02;

import javax.swing.JOptionPane;

public class Ciclos02 {

    public static void main(String[] args) {
        var numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        while (numero != 0) {
            if (numero > 0) {
                JOptionPane.showMessageDialog(null, "El número " + numero + " Es POSITIVO");
            } 
            else 
            {
                JOptionPane.showMessageDialog(null, "El número " + numero + " Es NEGATIVO");
            }
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        }
        JOptionPane.showMessageDialog(null, "El número " + numero + " finaliza el programa");
    }
}
