package Pruebas;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PruebaIfSwitchList {
    public static void main(String[] args) {
        /*Realizar un programa para registrar cuentas de usuarios
         * -hacer un menu el cual tenga la opcion de agregar cuentas, eliminar cuentas por usuario, ordenar por alfabeto
         * , y opcion de salir*/

        Scanner sc = new Scanner(System.in);
        boolean validacion = false, salir = false;
        int opcion = 0;
        String respuestas;
        MetodosCuenta metodos = new MetodosCuenta();
        do {
            System.out.println("*****************************************************************");
            System.out.println("*BIENVENIDO AL SISTEMA DE REGISTROS DE CUENTAS                  *\n" +
                    "*PORFAVOR INGRESE ALGUNAS DE LAS OPCIONES DESPLEGABLES DEL MENU *\n" +
                    "*****************************************************************\n" +
                    "1: Agregar cuenta\n" +
                    "2: Listar cuentas\n" +
                    "3: Borrar cuentas\n" +
                    "4: Ordenar cuentas por id\n" +
                    "5: Salir");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    Cuentas cuenta = new Cuentas();
                    cuenta.setId(cuenta.getId());
                    cuenta.setName(cuenta.getName());
                    cuenta.setEmail(cuenta.getEmail());
                    cuenta.setPrecio(cuenta.getPrecio());
                    cuenta.setTipo(cuenta.getTipo());
                    metodos.guardarCuenta(cuenta);
                    break;
                case 2:
                    System.out.println("Mostrando listado de cuentas");
                    metodos.mostrarCuenta();
                    break;
                case 3:
                    metodos.listaCuentas.clear();
                    System.out.println("datos eliminados exitosamente");
                break;
                case 4:
                    System.out.println("mostrar ordenados por id");
                    metodos.ordenarPorID();
                    break;
                case 5:
                    System.out.println("salir al menu principal?");
                    respuestas = sc.nextLine();
                    if (respuestas.equals("si")){
                        salir= true;
                    }
                default:
                    System.out.println("La opcion ingresada no es valida");

            }
            sc.nextLine();
            System.out.println("desea ingresar mas datos si, no?");
            respuestas = sc.nextLine();
            if (respuestas.equals("si")) {
                System.out.println("volviendo al menu principal...");
            } else {
                salir = true;
                System.out.println("Saliendo de la app..");
            }
        } while (!salir);

    }
}
