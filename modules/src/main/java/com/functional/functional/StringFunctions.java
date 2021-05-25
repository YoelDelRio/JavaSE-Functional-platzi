package com.functional.functional;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class StringFunctions {
    public static void main(String[] args) {
        //UnaryOperator: es una función que trabaja sobre un tipo definido
        // y genera un resultado del mismo tipo, no hay que definir la salida
        //quote tomara el texto y le pondra comillas
        UnaryOperator<String> quote = text -> "\"" + text + "\"";
        //addMark tomara el texto y le pondra una exclamacion final
        UnaryOperator<String> addMark = text -> text + "!";

        System.out.println(quote.apply("Hola Estudiante!"));
        System.out.println(addMark.apply("Hola"));

        //la funciones reciben un elemento de un tipo y generan otro(1 paramentro)
        //BiFunction toma dos tipos de datos para generar un tercero
        BiFunction<Integer, Integer,Integer> multiply = (x, y) -> x * y;
        System.out.println( multiply.apply(5,5));

        //BinaryOperator solo necesita un tipo de dato
        // para hacer lo mismo siempre que sea el mismo
        // recibe un tipo y los dos argumentos mas el resultado , reciben el tipo
        BinaryOperator<Integer> multiply2 = (x, y) -> x * y;
        System.out.println( multiply2.apply(5,5));

        //Funcion LeftPad
        // para poder añadir espacios a un string

        //un string para darle espacios,
        // un integer para la cantidad de espacios,
        // y como resultado generaremos un nuevo string
        BiFunction<String, Integer, String> leftPad =
                //String.format generara un nuevo string
                // con los parametros que le demos
                //queremos generar un nuevo string "%"
                // que tome la cantidad de espacios que le decimos
                // esto se define por la letra "s"
                // y que texto tiene que formatear
                (text, number) -> String.format("%" + number + "s", text);
        // ala palabra la convierta en una palabra que
        // tenga 10 elementos agregando espacios a la izquierda
        System.out.println(leftPad.apply("Java", 10));

        List<BiFunction<String, Integer, String >> formateadores;
    }


}
