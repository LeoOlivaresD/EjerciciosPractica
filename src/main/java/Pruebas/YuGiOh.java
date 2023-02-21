package Pruebas;

import Plantillas.yugioh.CardData;
import Plantillas.yugioh.CartasYuGiOh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class YuGiOh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        int opcion, cardLimit;
        String respuesta, cardName, cardType;
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
                    cardData.agregarCarta();
                    break;
                case 2:
                    System.out.println("Ingrese el nombre de la carta que desea buscar");
                    cardName = sc.nextLine();

                    break;
                    case 3:
                        //find for type
                        break;
                case 4:
                    //find limitCard
                    break;
                case 5:
                    //mostrar lista de cartas
                    cardData.showList();
            }
        }while (!salir);

    }
}
