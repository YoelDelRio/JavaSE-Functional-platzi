package com.functional.functional;

import com.functional.functional.referencies.NombresUtil;

import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.stream.Stream;

public class Streams {
    //un Stream es una especie de lista que tiene elementos autoiterables()
    //la diferencia entre un stream y una lista es:
    public static void main(String[] args) {
        //creo una lista que reciba de
        // la funcion anteriormente creada para recoger listas
        // le pasamos cualquier tipo de dato y nos devuelve una lista de esos datos
        List<String> courseList = NombresUtil.getList(
                "java","Frontend","backend","fullstack");
        //opero con  un "for" sobre los datos
        for (String course : courseList){
            String newCourseName = course.toLowerCase()//almaceno los cursos en un parametro
                    .replace("!", "!!");//reemplazo un signo por otro
            System.out.println("Yoel: "+ newCourseName);//imprimir
        }

        //un stream se define de un cierto tipo, Stream.of() es la manera sencilla de generar Stream
        Stream<String> courseStream = Stream.of("java","Frontend","backend","fullstack");
        //para poder iterar(consumir) estos datos lo haremos con operaciones
        //.map recibe una funcion que trabaja sobre un string"T" y genera un nuevo dato"R"
        // puedo generar un Stream de enteros de la longitud de caracteres en el curso
        //Stream<Integer> courseLengthStream = courseStream.map(course -> course.length());
        // o queremos conocer el nombre mas largo que tenemos en el Stream
        // (para que cuadre un nombre dentro de un campo de texto)
        //Optional<Integer> longest = courseLengthStream.max((x, y) -> y -x);
        // si no ponemos que el tipo sea Optional de enteros, nos dara error,
        // ya que cabe la posibilidad de que el stream este vacio

        //quiero agregar el enfasis a cada nombre de los Streams
        // para agregarlo hay que generar un nuevo Stream, puesto que son IMMUTABLES
        //.map nos da cada elemento el Stream y nos genera uno nuevo que no tiene que ser del mismo tipo
        Stream<String> emphasisCourses = courseStream.map(course -> course + "!");//*1
        //se crea un stream resultante del forEach
        //pasaremos un predicado para determinar cuando seleccionar un curso
        // los elementos de este Stream son exclusivamente los que contengan "java"
        //Stream<String> justJavaCourses = courseStream.filter(course -> course.contains("java"));//*2
        //para consumirlo en pantalla seria con .forEach
        //emphasisCourses.forEach(System.out::println);
        // te dara un error asi, por que los Streams solo pueden ser consumidos una vez
        // quiero consumir emphasisStream despues de courseStream
        // courseStream se consume en esta linea *1 y se inutiliza
        //cuando intento hacer el filtrado no puedo por que ya se consumir *2

        //forma correcta de un solo dato por pantalla
        Stream<String> justJavaCourses = emphasisCourses.filter(course -> course.contains("java"));
        justJavaCourses.forEach(System.out::println);

    }
}
