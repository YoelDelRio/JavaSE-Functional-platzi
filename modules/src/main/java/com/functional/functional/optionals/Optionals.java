package com.functional.functional.optionals;

import org.graalvm.compiler.nodes.calc.IntegerDivRemNode;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class Optionals {
    //la clase optional evita problemas
    // con valores ya existentes(NullPointerExceptions)
    // cada vez que instancias no tienes que preocuparte por el valor de retorno


    public static void main(String[] args) {
        List<String> name = getNames();
        if(name != null){

        }
        Optional<List<String>> optionalNames = getOptionalNames();
        if(optionalNames.isPresent()){

        }
        optionalNames.ifPresent(namesValue -> namesValue.forEach(System.out::println));

        Optional<String> valuablePlayer = optionalValuablePlayer();
        String valuablePlayerName = valuablePlayer.orElseGet(() -> "No Player");
    }

    static List<String> getNames(){
        List<String> list = new LinkedList<>();

        return Collections.emptyList();
    }

    static  String mostValuablePlayer(){
        return  "";
    }

    static int mostExpensiveItem(){
        return -1;
    }

    static Optional<List<String>> getOptionalNames(){
        List<String> namesList = new LinkedList<>();
        //Obtencion de nombres
        return Optional.of(namesList);
    }

    static Optional<String> optionalValuablePlayer(){
        //return Optional.ofNullable();
        try {
            //accesos
            return Optional.of("Yoel");
        }catch (Exception e){
            e.printStackTrace();
        }
        return Optional.empty();

    }
}
