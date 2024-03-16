package Pruebas.ArrayBidemencional;

import java.util.Scanner;

//Objetivo almacenar en un arreglo animales, en donde las columnas muestren, nombre,edad, color, especie, tamaño
public class Animales {
    public static void main(String[] args) {

        //Variable a utilizar:
        String nombre, color, especie, respuesta, size;
        int cantidadRegistros, edad;
        boolean salir = false;
        //Creamos el objeto Scanner para guardar las respuestas por teclado en nuestras variables
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido al registro de animales");
        do {
            System.out.println("Cuantos animales desea registrar ?");
            cantidadRegistros = sc.nextInt();
            sc.nextLine();
            String[][] arregloAnimales = new String[cantidadRegistros][5]; //Creacion de nuestro arreglo en funcion de la cantidad de registros

            for (int i = 0; i < arregloAnimales.length; i++) {
                for (int j = 0; j < 1; j++) {
                    do {
                        System.out.println("Ingrese el nombre del animal");
                        nombre = sc.nextLine();
                    } while (nombre.isEmpty());

                    arregloAnimales[i][0] = nombre; //Guardamos el nombre ingresado en la fila segun índice de "i" en la posicion 0 de las columnas

                    do {
                        System.out.println("Ingrese edad del animal");
                        edad = sc.nextInt();
                    } while (edad < 0);
                    sc.nextLine();
                    arregloAnimales[i][1] = String.valueOf(edad); //Con value of convertimos un int a string,
                    // En este caso guardamos el nombre ingresado en la fila segun índice de "i" en la posicion 1 de las columnas

                    do {
                        System.out.println("De que color es su animal");
                        color = sc.nextLine();
                    } while (color.isEmpty()); //Empty es para saber si la cadena esta vaciá

                    arregloAnimales[i][2] = color;

                    //Guardamos el nombre ingresado en la fila segun índice de "i" en la posicion 2 de las columnas
                    do {
                        System.out.println("Cual es la especie de su animal?");
                        especie = sc.nextLine();
                    } while (especie.isEmpty());

                    arregloAnimales[i][3] = especie;//Guardamos el nombre ingresado en la fila segun índice de "i" en la posicion 3 de las columnas

                    do {
                        System.out.println("De que tamaño es su mascota? \n" +
                                "responda con pequeño, mediano o grande");
                        size = sc.nextLine();
                    } while (size.isBlank()); //Este metodo distingue si hay espacios en blanco

                    arregloAnimales[i][4] = size;//Guardamos el nombre ingresado en la fila segun índice de "i" en la posicion 4 de las columnas

                }
            }
            System.out.println("Desea ver los datos almacenados en el arreglo\n" +
                    "Presione la tecla \"enter\" para mostrar en pantalla?");
            sc.nextLine();
            //Imprimimos el arreglo por pantalla
            for (int i = 0; i <arregloAnimales.length ; i++) {
                for (int j = 0; j <5 ; j++) {
                    System.out.print(arregloAnimales[i][j] + " ");
                }
                System.out.println(" ");
            }

            System.out.println("Desea ingresar mas registros? \n" +
                    "Responda si / no");
            respuesta = sc.nextLine();
            if (respuesta.equalsIgnoreCase("si")) {
                System.out.println("presione la tecla \"enter\" para continuar");
                sc.nextLine();
            } else {
                salir = true;
                System.out.println("saliendo de la app");
            }

        } while (!salir);
    }
}
