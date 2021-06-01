import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamCollectors {
    public static void main(String[] args) {
        //TODO convertiremos un Stream de datos que hace operaciones
        // a una lista que ya es fija y tiene un numero definido de elementos


        IntStream infiniteStream = IntStream.iterate(0, x -> x + 1);
        List<Integer> numberList = infiniteStream.limit(1000)
                .filter(x -> x % 2 == 0)
                //.boxed = nuestro Stream trabaja sobre enteros de tipo Stream
                // y le haremos que trabaje sobre un Stream de Integer
                .boxed()
                .collect(Collectors.toList());
                //collectors= recopilar los datos de un stream en una sola estructura de dato
                // con colect podemos convertir un stream en datos en una estructura sin operadores
                // con datos concretos resultado de aplicar multiples operadores a un stream
        // en este caso , devolvera una lista de Integers
        //despues de esto ya no se uede agregar mas operaciones
        //permite estas estructuras de datos:
        // toCollection= (convertir a coleccion)tomamos un Stream de datos y gerera una coleccion de datos,
        // sin tipo especificos
        // toCurrentMap(mapa concurrente) = para paralelismo o concurrencia
        //toList (a lista)
        //toMap= donde tenemos una llave y un valor partiendo de los datos y necesita una funcion
        //con la cual generara una llave para cierto dato
        //toSet= estructura de elemenos unicos




    }
}
