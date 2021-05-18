package com.functional.functional;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class StringFunctions {
    public static void main(String[] args) {
        UnaryOperator<String> quote = text -> "\"" + text + "\"";
        UnaryOperator<String> addMark = text -> text + "!";

        System.out.println(quote.apply("Hola Estudiante!"));
        System.out.println(addMark.apply("Hola"));

        BiFunction<Integer, Integer,Integer> multiply = (x, y) -> x * y;

        System.out.println( multiply.apply(5,5));

        BinaryOperator<Integer> multiply2 = (x, y) -> x * y;

        System.out.println( multiply2.apply(5,5));

        //Funcion LeftPad

        BiFunction<String, Integer, String> leftPad =
                (text, number) -> String.format("%" + number + "s", text);

        System.out.println(leftPad.apply("Java", 10));

        List<BiFunction<String, Integer, String >> formateadores;
    }


}
