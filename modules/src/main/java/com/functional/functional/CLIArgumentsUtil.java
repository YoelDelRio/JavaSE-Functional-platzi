package com.functional.functional;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class CLIArgumentsUtil {
    //Clase de Utilidades

    //funcion que nos muestra el manual cuando ishelp esta presente
    static void showHelp(CLIArguments cliArguments){
        //Consumer= interfaz generica que trabaja sobre un tipo de dato
        // en este caso, nuestro CLIArguments / recibira un cliarguments
        Consumer<CLIArguments> consumerHelper = cliArguments1 -> {
            //si el cliaArguments invoca isHelp
            if (cliArguments1.isHelp()){
                //de momento informa
                System.out.println("Manual solicitado");
            }
        };
        //para invocar al consumer .accept y le pasamos el dato
        consumerHelper.accept(cliArguments);

    }

    static CLIArguments generateCLI(){
        //Creo otra funcion que traiga el
        //Supplier = interface generica que genera datos de cierto tipo
        // se encarga de proveer datos, dentro solo tiene .get
        Supplier<CLIArguments> generator = () -> new CLIArguments();
        return generator.get();


    }
}
