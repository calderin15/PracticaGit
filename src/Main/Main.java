package Main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //Creamos la lista
        List<String> list = new ArrayList<>();

        //Añadimos elementos a la lista
        list.add("Andres");
        list.add("Jose");
        list.add("Luis");
        list.add("Miguel");
        list.add("David");
        list.add("Camilo");
        list.add("Juan");

        //Mostramos la lista
        System.out.println("Lista: " + list);

        //Buscamos elementos en la lista
        System.out.println("Esta Camilo en la lista? ->" + list.contains("Camilo"));
        System.out.println("Esta Marlon en la lista? ->" + list.contains("Marlon"));

        //Modificamos un elemento de la lista
        list.set(0, "Pedro");

        //Volvemos a mostrar la lista pero con un foreach
        for (String nombre: list) {
            System.out.println("Nombre: " + nombre);
        }

        //Eliniminamos un elemento de la lista
        //Aqui podemos pasar el elemento y eliminarlo
        list.remove("Juan");
        //Aqui podemos pasar su posición y eliminarlo
        list.remove(2);

        System.out.println("- - - - - - - - - - - - - - -");

        //Mostramos la lista pero con iteradores
        Iterator iterator = list.iterator();
        while(iterator.hasNext()) {
            iterator.hashCode();
            System.out.println("Nombre: " + iterator.next());
        }
        //Obtenemos el tamaño de la lista
        System.out.println("El tamaño es: " + list.size());
    }

}
