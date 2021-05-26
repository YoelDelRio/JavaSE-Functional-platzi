package com.functional.functional.inference;

import com.functional.functional.referencies.NombresUtil;

import java.util.List;
import java.util.function.Function;

public class Inferencia {
    //la inferencia de tipos es que la maquina en tiempo de compilacion
    // se encarga de validar los tipos para que sean los que corresponde
    //Java "adivina" el tipo de dato generera y devuelve
    public static void main(String[] args) {
        Function<Integer, String> funcionConvertidora =
                x -> "Al doble: " + (x * 2);

        List<String> alumnos = NombresUtil.getList("Hugo", "Paco", "luis");
        //sin inferencia, le ponemos los tipos de datos nosotros
        alumnos.forEach((String name) -> System.out.println(name));
        // con inferencia del tipo no es necesario poner el tipo de dato
        alumnos.forEach(name -> System.out.println(name));
        //inferencia con el operador de referencia para lambdas
        alumnos.forEach(System.out::println);
        //para poder tener inferencia necesitamos que el metodo reciba el mismo tipo que le doy
        // y devuelva el mismo que pido
    }
}
