package com.functional.functional.sam;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;

public class AgeUtils {

    //SAM = SINGLE ABSTRACT METHOD
    //Representa que es una interfaz que
    // tiene un solo metodo sin definir

    // ToDo este metodo calcula la edadde alguien
    //  basandonos en su dia mes y año de nacimiento

    public static void main(String[] args) {
        Function<Integer,String> addCeros = x -> x < 10 ? "0" + x : String.valueOf(x);

        TriFunction<Integer, Integer, Integer, LocalDate> parseDate =
                (day, month, year) -> LocalDate.parse(year + "-"
                        + addCeros.apply(month) + "-" + addCeros.apply(day));

        TriFunction<Integer,Integer, Integer, Integer> calculatedAge =
                (day, month, year) -> Period.between(
                        parseDate.apply(day,month,year),LocalDate.now()
                ).getYears();

        System.out.println(calculatedAge.apply(10,10,1993));
    }


    @FunctionalInterface
    interface TriFunction<T,U,V,R>{
        R apply(T t, U u, V v);
    }
}
