package Pruebas;

import Plantillas.yugioh.CardData;
import Plantillas.yugioh.CartasYuGiOh;

import java.util.Scanner;

public class YuGiOh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        String respuesta;
        CardData cardData = new CardData();
        do {
            System.out.println("*****************************************");
            System.out.println("*Bienvenido al editor de cartas Yu-Gi-Oh*");
            System.out.println("*****************************************");
            System.out.println("*Elija una de las siguientes opciones   *");
            System.out.println("1: Add Card\n" +
                    "2: Find for Name\n" +
                    "3: Find for type\n" +
                    "4: Find LimitCard\n" +
                    "5: Show card list\n" +
                    "6: Delete Card by name\n" +
                    "7: Salir");
            opcion = sc.nextInt();

            switch (opcion){
                case 1:
                    CartasYuGiOh cartas = new CartasYuGiOh();
                    cartas.setIdCard(cartas.getIdCard());
                    cartas.setName(cartas.getName());
                    cartas.setType(cartas.getType());
                    cartas.setEffect(cartas.getEffect());
                    cartas.setRarityCard(cartas.getRarityCard());
                    cartas.setLimitCard(cartas.getLimitCard());
                    cardData.registrarCarta(cartas);
                    break;

                case 2:
                    System.out.println("Listando por nombre...");
                    cardData.listarPorNombre();
                    System.out.println("Terminando listado");
                    break;
            }
            
        }while (!salir);

    }
}
