package com.functional.functional;

import java.util.stream.IntStream;

public class TypeStream {
    public static void main(String[] args) {
        //IntStream= Stream que genera enteros,
        // infiniteStream= genera datos infinitos
        // quiero limitar el numero de datos recogidos
        IntStream infiniteStream = IntStream.iterate(0,x -> x + 1);
        //empezamos en 0, generamos el 1, y luego el 2, el 3...
        infiniteStream.limit(1000)//lo limitamos a los primeros 1000 numeros
                .parallel()//*1
                .filter(x -> x % 2 == 0)// lo filtrams a los numeros pares
                //.allMatch es un funcion que toma un predicado sobre enteros
        //cuando creamos un Stream especifico,
        // todas las funciones, operadores, etc, seguiran trabajando sobre ese tipo
        //podemos agregar funciones sin necesidad de validar el dato o propiedades
        //.allMatch(x -> x % 2 == 0) es redundante peor nos devuelve un boolean
        //es uan forma de validar (que todos los empleados tengas Ids,
        // o que todas las personas esten afiliadas a un cierto programa,
        // o validar los telefonos de nuestra agenda con sintaxis valida,
        // o campos de un formulario)
        .forEach(System.out::println);//por cada uno nos lo imprime
        //este tipo de operaciones suelen ser "pesadas"
        // .parallel ayuda a que los datos se procesen de manera concurrente *1
        // (si nuestro procesador tiene 4 nucleos, se ejecutaran 4 operaciones a la vez, en paralelo)
        //  al final Stream  recolecta los datos en un solo elemento
        // esto sirve para tareas que no nos importe un orden, por que se mezcla

    }
}
