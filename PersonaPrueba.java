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
        
        Persona persona2 = new Persona("Pablo", 200000, true);
        
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
