

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

    // Asistencia Pablo Perez

package test;

import dominio.*;           // El asterisco realiza un import de todas las clases que se encuentren dentro del package.
                            // No implica un mal uso de memoria, porque las clases no ocuparan de esta si no son usadas.

public class PersonaPrueba {
    public static void main(String[] args) {
        Persona persona1 =  new Persona("Osvaldo", 57000, false);
        
        // Modificar a traves de los metodos.
        persona1.setNombre("Juan Ignacio");
        //persona1.nombre("Juan Ignacio");                                          Esta manera de modificar ya no puede utilizarse porque el atributo es de tipo privado.
        //System.out.println("Nombre es: "+persona1.nombre);                        Al igual que esto, solo se puede llamar al atributo mediante metodos por ser de tipo privado.
        System.out.println("Su nombre modificado es: "+persona1.getNombre());
        System.out.println("Su sueldo es: "+persona1.getSueldo());
        System.out.println("Booleano: "+persona1.isEliminado());
        /* Tarea: crear otro objeto de tipo Persona, asignar valores de manera 
        inicial e imprimir, luego modificar sus valores y volver a imprimir.
        */
        
        // Creamos un nuevo objeto de tipo Persona
        
        Persona persona2 = new Persona("Pepe", 200000, true);
        
        // Pedimos sus datos a traves de metodos
        
        System.out.println("El nombre es "+persona2.getNombre());
        System.out.println("Su sueldo es de $"+persona2.getSueldo());
        System.out.println("Booleano: "+persona2.isEliminado());
        
        // Modificamos a traves de metodos
        
        persona2.setNombre("Roberto");        
        persona2.setSueldo(200001);
        persona2.setEliminado(true);
        
        // Pedimos los datos modificados mediante metodos.
        
        System.out.println("El nombre modificado es "+persona2.getNombre());
        System.out.println("El sueldo modificado es de $"+persona2.getSueldo());
        System.out.println("Booleano modificado: "+persona2.isEliminado());
        
        
        
        
    }
}
/*
    Asistencia Gonzalo Tapia por el mes de Octubre!!!
 */
package Ciclos05;

import javax.swing.JOptionPane;


public class Ejercicio05 {
    public static void main(String[] args) {
        
        int numero ,aleatorio, conteo = 0 ;
        aleatorio = (int)(Math.random()*100);
        
        do{
            numero= Integer.parseInt(JOptionPane.showInputDialog("Digite un num: "));
            if(numero <aleatorio){
                JOptionPane.showMessageDialog(null, "El numero mayor ");
            }
            else if(numero > aleatorio){
                JOptionPane.showMessageDialog(null, "El numero menor ");
            }
            else{
                JOptionPane.showMessageDialog(null, "Felicitaciones es el num correcto");
            }
            conteo ++;
        }while(numero != aleatorio);
        JOptionPane.showMessageDialog(null, "Adivinaste en "+conteo+" intentos");
    }
}

/*
ASISTENCIA FERNANDEZ LEONARDO
Ejercicio 10: pedir 10 números y escribir la suma
total
HAcerlo con la clase Scanner y JOptionPane
*/
package ciclos10;

import java.util.Scanner;

public class Cilos10 {
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       int numero, suma = 0;
       for(int i = 1; i <= 10; i++){
           System.out.println("Digite un número: ");
           numero = Integer.parseInt(entrada.nextLine());
           suma += numero;
       }
        System.out.println("\nLa suma de todos los números es: "+suma);
    }
}

/* ASISTENCIA: CABALLERO, GABRIEL AGUSTIN
/*
Ejercicio 12: Pedir un numero y calcular su factorial.
Hacerlo con las dos clases, Scanner y JOptionPane
 */
package ciclos12;

import java.util.Scanner;


public class Ciclos12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        long factorial = 1;
        System.out.println("Digite un numero: ");
        int numero = Integer.parseInt(entrada.nextLine());
        for(int i=1; i<=numero;i++){
            factorial *= 1;
        }
        System.out.println("\nEl factorial del numero ingresado es: "+factorial);
        
    }
    
}

/* Asistencia Palma Eduardo Adrian
*/
/*
Ejercicio 12: Pedir un numero y calcular su factorial
Hacerlo con las dos clases, Scanner y JOptionPane
*/
package ciclos12;

//import java.util.Scanner;

import javax.swing.JOptionPane;


public class Ciclos12 {
    public static void main(String[] args) {
        //Scanner entrada = new Scanner(System.in);
        long factorial = 1;
        //System.out.println("Digite un numero: ");
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite unnumero: "));
        for(int i=1; i <=numero;i++){
            factorial *= i;
        }
        //System.out.println("\nEl factorial del numero ingresado es:"+factorial);
        JOptionPane.showMessageDialog(null, "El factorial del numero ingresado es: "+factorial);
        
    }
    
}




