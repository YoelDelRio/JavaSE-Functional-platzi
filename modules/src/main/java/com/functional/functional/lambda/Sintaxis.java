package com.functional.functional.lambda;

import com.functional.functional.referencies.NombresUtil;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class Sintaxis {
    public static void main(String[] args) {
        List<String> cursos = NombresUtil.getList("Java", "Functional");

        cursos.forEach(curso -> System.out.println(curso));

        usarZero(() -> 2);

        usarPredicado(text -> text.isEmpty());

        usarBiFunction((x,y) -> x * y);

     }
     static void usarZero(ZeroArguments zeroArguments){

     }

     static void usarPredicado(Predicate<String> predicado){

     }

     static void usarBiFunction(BiFunction<Integer, Integer, Integer> operacion){

     }

     @FunctionalInterface
    interface ZeroArguments{
        int get();
     }
}
