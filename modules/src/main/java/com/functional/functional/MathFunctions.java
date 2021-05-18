package com.functional.functional;

import java.util.function.Function;
import java.util.function.Predicate;

public class MathFunctions {
    public static void main(String[] args) {
        Function<Integer, Integer> square = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer x) {
                return x * x;
            }
        };
        System.out.println(square.apply(7));

                            //es impar
        Function<Integer, Boolean>isOdd = x -> x % 2 == 1;

        // una funcion que testea creado un valor boolean
        Predicate<Integer> isEven = x -> x% 2== 0;// es par

        //invocamos con un metodo diferente a apply
        //parsa poder ejecutar Predicate
        isEven.test(4);//true

        Predicate<Student> isApproved = student -> student.getCalification() > 6.0;

        Student estudiante = new Student(5.9);
        System.out.println(isApproved.test(estudiante));
    }

    static class Student {
        private double calification;
        //creo un constructor donde le pasamos la calificacion
        public Student(double calification) {
            //seteo la calificacion con el valor pasado
            this.calification = calification;
        }

        public double getCalification() {
            return calification;
        }
    }

}
