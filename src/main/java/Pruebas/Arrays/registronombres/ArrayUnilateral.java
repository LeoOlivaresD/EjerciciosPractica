package Pruebas.Arrays.registronombres;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayUnilateral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantidadRegistros;
        String name;

        do {
            System.out.println("Bienvenido\n" +
                    "¿ cuantos registros desea ingresar ? ");
            cantidadRegistros = sc.nextInt();
        } while (cantidadRegistros <= 0);
        sc.nextLine();
        String[] arrayRegistros = new String[cantidadRegistros]; //Aca decimos la dimencion que tendra el arreglo de acuerdo al numero que almacenara la variable cantidadRegistros


        for (int i = 0; i < arrayRegistros.length; i++) { //recorrimos el arreglo con el nombre de el mas el metodo.lenght
            do {
                System.out.println("Ingrese el nombre " + (i + 1) + "°" + " registro");
                name = sc.nextLine();
            } while (name.isEmpty());

            arrayRegistros[i] = name; //rellenamos el array con lo que tenga la variable "name"
        }

        System.out.println("Imprimiendo Datos del Array");
        for (int i = 0; i <arrayRegistros.length ; i++) {
            System.out.println("En la posicion " + i + " del arreglo esta registrado el nombre: "+ arrayRegistros[i]);
        }
    }
}
