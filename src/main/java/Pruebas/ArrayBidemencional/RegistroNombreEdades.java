package Pruebas.ArrayBidemencional;

import java.util.Scanner;

//Crear una app que registre nombres y edades de usuarios
public class RegistroNombreEdades {
    public static void main(String[] args) {
        String name;
        int edad, cantidadRegistros;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Cuantos registros desea ingresar");
            cantidadRegistros = sc.nextInt();
        }while (cantidadRegistros <=0);
        sc.nextLine();

        //Creacion de Arreglo bidimensional
        String [][] registros = new String[cantidadRegistros][2];

        //Relleno del Arreglo bidimensional
        for (int i = 0; i < registros.length; i++) {
            for (int j = 0; j < 1 ; j++) {
                do {
                    System.out.println("Ingrese nombre ");
                    name = sc.nextLine();
                }while (name.isEmpty());

                registros[i][0] =  name;

                do {
                    System.out.println("Ingrese la edad de la persona");
                    edad = sc.nextInt();
                }while (edad<=0);
                registros[i][1] = String.valueOf(edad);
                sc.nextLine();
            }
        }

        //Imprimiendo arreglo
        for (int i = 0; i < registros.length ; i++) {
            for (int j = 0; j < 2 ; j++) {
                System.out.print(registros[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
