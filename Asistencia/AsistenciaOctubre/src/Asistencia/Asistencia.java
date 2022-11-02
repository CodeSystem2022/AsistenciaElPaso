

/*
ESTA ES LA ASISTENCIA DEL GRUPO EL PASO
*/
package Asistencia;

import javax.swing.JOptionPane;


public class Asistencia {
    public static void main(String[] args) {
        
        
        // ASISTENCIA MES OCTUBRE
        
        
        // DENIS MEMBRIVE
        
        /*
        Ejercicio 11: Diseñar un programa que muestre el producto de los 10 primeros numero impares.
        Hacerlo con JOptionPane
         */
        
        int i, producto = 1;
        for (i = 1; i <= 20; i++) {
            if (i % 2 != 0) {
                producto *= i;

            } else {

            }

        }
        JOptionPane.showMessageDialog(null, "El producto de los primero 10 numero impares es: " + producto);

    }
    
}
