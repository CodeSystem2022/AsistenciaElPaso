

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

        //Asistencia Iván Ramírez
        //Ejercicio 12: Pedir un número y calcular su factorial.
        //Hacerlo con las dos clases, Scanner y JOPtionPane
        //Clase Scanner
        /*Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int numero = Integer.parseInt(entrada.nextLine());
        int factorial = 1;
        for(int i = 1; i<=numero; i++){
            factorial = factorial * i;
        }
        System.out.println("El factorial del "+numero+" es: "+factorial);*/
        
        //Clase JOPtionPane
        /*int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
        int factorial = 1;
        for(int i = 1; i<=numero; i++){
            factorial = factorial * i;
        }
        JOptionPane.showMessageDialog(null, "El factorial del número "+numero+" es: "+factorial);*/

    }
    
}

/*
Asistencia Javier Reyes
Ejercicio 2: Leer un numeo e indicar si es positivo o 
negativo. El proceso se repetira hasta que se introduzca
un cero 0
Hacer este ejercicio con la clase Scanner, 
luego hacer lonuevamente con la clase
JOptionpane
 */
package Ciclos02;

import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite un numero: ");
        var numero = Integer.parseInt(entrada.nextLine());
        while (numero != 0) {
            if (numero > 0) {
                System.out.println("El número " + numero + " Es POSITIVO ");
            } 
            else {
                System.out.println("El número " + numero + " Es NEGATIVO");
            }
            System.out.println("Digite otro numero: ");
            numero = Integer.parseInt(entrada.nextLine());
        }
        System.out.println("El número " + numero + " finaliza el programa");
    }
}
