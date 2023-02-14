import java.util.ArrayList;
import java.util.List;

public class Lista {
    public static void main(String[] args) {
        List<String> animales = new ArrayList<>();

        animales.add("gato");
        animales.add("perro");
        animales.add("pajaro");
        animales.add("elefante");
        animales.add("cocodrile");
        animales.add("leon");

        System.out.println("Tamaño lista: " + animales.size());
        System.out.println("Búsqueda filtrando a perro" +animales.contains("perro")); //Contains nos servira para buscar por una palabra en específico dentro de la lista
        System.out.println("Impression de todos los datos de la Lista");

        for (String n:animales) {                       //for each nos facilita imprimir todos los datos de la lista
            System.out.println("animal: " + n);         //su syntaxis consiste en el for seguido por el parenthesis
                                                        // y dentro de él, el tipo de dato y el nombre que se le dara
        }                                               //seguido de "dos puntos" el element al cual se compara, en este caso la lista "animales"

        System.out.println("Elimination de un elemento en lista\n" +
                "eliminaremos : pajaro\n" +
                "elimnando pajaro...");
        animales.remove(2);

        System.out.println("verificamos nuevamente el tamaño de la lista");
        System.out.println("Tamaño lista: " + animales.size());
        System.out.println("Verificamos el listado total para ver si aparece pájaro");
        for (String n: animales){
            System.out.println("animal: " + n);
        }
    }
}
