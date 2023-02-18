package Plantillas.yugioh;

import Pruebas.YuGiOh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//Usare esta clase para crear todos los metodos de la clase principal
public class CardData implements Comparator<CartasYuGiOh> {
    //Lista de cartas
    List<CartasYuGiOh> listaDeCartas = new ArrayList<>();

    //metodo para agregar cartas a la lista
    public void registrarCarta(CartasYuGiOh carta){
        listaDeCartas.add(new CartasYuGiOh());
    }

    //metodo para listar cartas

    public void listarPorNombre (){
        Collections.sort(listaDeCartas, new Comparator<CartasYuGiOh>() {
            @Override
            public int compare(CartasYuGiOh primeraCarta, CartasYuGiOh segundaCarta) {
                return primeraCarta.getName().compareTo(segundaCarta.getName());
            }
        });
    }
    @Override
    public int compare(CartasYuGiOh primeraCarta, CartasYuGiOh segundaCarta) {
        return primeraCarta.getName().compareTo(segundaCarta.getName());
    }
}
