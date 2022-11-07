/*
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
