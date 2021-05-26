package com.functional.functional.referencies;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class NombresUtil {
    public static void main(String[] args) {
        List<String> profesores = getList("Nicolas", "Jorge", "Zaira");
        // la estructura de forEach dice que requiere un Consumer<>
        // que reciba cada uno de los elementos de la lista
        Consumer<String> printer = text -> System.out.println(text);
        profesores.forEach(printer);// la lista se iterara internamente con cada uno de los elementos

        //otra forma para hacer esto es
        // en lugar que crear un consumer utilizare la referencia de algun metodo que necesite con "::"
        //:: significa ve a buscar este metodo/funcion en este objeto
        profesores.forEach(System.out::println);// es exactamente lo mismo
    }


    public static <T> List<T> getList(T ... elements){
        return Arrays.asList(elements);
    }
}
