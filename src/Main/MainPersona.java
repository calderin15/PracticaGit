package Main;

import java.util.ArrayList;
import java.util.List;

public class MainPersona {

    public static void main(String[] args) {
        List<Persona> personas = new ArrayList<Persona>();

        Persona[] lista = {new Persona("Andres Gomez", "Bogota DC", "(555) 111 667 3"),
                    new Persona("Maria Castro", "Bogota DC", "(555) 234 532 4"),
                new Persona("Jhon Martinez", "Bogota DC", "(555) 745 765 5"),
                new Persona("Miguel Miranda", "Bogota DC", "(555) 543 344 7"),
                new Persona("Laura Padilla", "Bogota DC", "(555) 872 654 2"),
                new Persona("Martha Luna", "Bogota DC", "(555) 456 123 9")
        };

        Persona persona = new Persona("Lol master", "Momil DC","(333)6667778");


        for (Persona p: lista) {
            personas.add(p);
        }
        personas.add(persona);

        System.out.println("Listado de personas:\n");
        System.out.println("- - - - - - - - - - - - - - - - -");
        for (Persona p: personas) {
            System.out.println(p.toString());
            System.out.println("- - - - - - - - - - - - - - - - -");
        }
        System.out.println("Existe lol masterYT en la lista "+personas.contains(persona));

    }

}
