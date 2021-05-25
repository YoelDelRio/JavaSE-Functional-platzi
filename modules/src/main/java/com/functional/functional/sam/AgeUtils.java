package com.functional.functional.sam;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;

public class AgeUtils {

    //SAM = SINGLE ABSTRACT METHOD
    //Representa que es una interfaz que
    // tiene un solo metodo sin definir

    // ToDo este metodo calcula la edad de alguien
    //  basandonos en su dia, mes y año de nacimiento

    public static void main(String[] args) {
        //los meses y dias deben de tener un cero delante si no llegan a 10
        // tomareos una x y si x es menor a 10 devolveremos(?) "0" más x
        // de lo contrario(:) devolveremos un String.valueof de x
        Function<Integer,String> addCeros = x -> x < 10 ? "0" + x : String.valueOf(x);
        //convierte 3 tipos de datos a una fecha
        TriFunction<Integer, Integer, Integer, LocalDate> parseDate =
                (day, month, year) -> LocalDate.parse(year + "-"
                        + addCeros.apply(month) + "-" + addCeros.apply(day));
        //esta funcion hara el calculo de la Edad
        TriFunction<Integer,Integer, Integer, Integer> calculatedAge =
                //generaremos un Period y calcularemos lo que hay entre(.between)
                // hoy y la fecha generada con apply
                // y devolveresmo los años ue hay entre ellos
                (day, month, year) -> Period.between(
                        parseDate.apply(day,month,year),LocalDate.now()
                ).getYears();
        // podemos calcular la edad de alguien
        System.out.println(calculatedAge.apply(10,6,1993));
    }

    //anotacion que define la interfaz como una funcion
    // no permite mas de un metodo
    @FunctionalInterface

    interface TriFunction<T,U,V,R>{
        //funcion que trabaja sobre 3 tipos de datos (TUV) y devuelve otro (R)
        R apply(T t, U u, V v);
    }
}
