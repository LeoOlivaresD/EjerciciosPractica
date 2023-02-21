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
    CartasYuGiOh cartas = new CartasYuGiOh();

    public List<CartasYuGiOh> getListaDeCartas() {
        return listaDeCartas;
    }

    public void setListaDeCartas(List<CartasYuGiOh> listaDeCartas) {
        this.listaDeCartas = listaDeCartas;
    }

    public CartasYuGiOh getCartas() {
        return cartas;
    }

    public void setCartas(CartasYuGiOh cartas) {
        this.cartas = cartas;
    }

    //OPCION 1 metodo para registrar cartas
    public void agregarCarta(){
        CartasYuGiOh cartas = new CartasYuGiOh();
        cartas.setIdCard(cartas.getIdCard());
        cartas.setName(cartas.getName());
        cartas.setType(cartas.getType());
        cartas.setEffect(cartas.getEffect());
        cartas.setRarityCard(cartas.getRarityCard());
        cartas.setLimitCard(cartas.getLimitCard());
        listaDeCartas.add(cartas);
    }
    //OPCION 2 ENCONTRAR POR NOMBRE
    public void findByName(){

    }
    //ListarCartas en lista
    public void showList(){
        for (CartasYuGiOh cartas: listaDeCartas) {
            System.out.println(cartas.toString());
            System.out.println("*************************");
        }
    }

    @Override
    public int compare(CartasYuGiOh primeraCarta, CartasYuGiOh segundaCarta) {
        return primeraCarta.getName().compareTo(segundaCarta.getName());
    }
}
