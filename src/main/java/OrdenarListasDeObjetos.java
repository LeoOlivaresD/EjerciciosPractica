import Plantillas.Animales;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenarListasDeObjetos {
    public static void main(String[] args) {
        List<Animales> animales = new ArrayList<>();
        animales.add(new Animales(1,"Gato","Omnivore",10));
        animales.add(new Animales(3,"Perro","Omnivore",8));
        animales.add(new Animales(8,"Leon","Carnivore",13));
        animales.add(new Animales(2,"Tortuga","Omnivore",23));
        animales.add(new Animales(7,"Huemul","Herbivorous",3));

        System.out.println("Imprimiendo listado de animales en lista \"animales\"");
        for (Animales n :  animales){
            System.out.println(n.toString());
        }

        System.out.println("Ahora mostraremos los animales ordenados alfabéticamente");
        Collections.sort(animales);
        for (Animales animal :animales){
            System.out.println(animal.toString());
        }
    }
}
