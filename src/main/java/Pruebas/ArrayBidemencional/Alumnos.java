package Pruebas.ArrayBidemencional;

import java.util.Scanner;

public class Alumnos {
    public static void main(String[] args) {
        float notas, promedio, acumulador = 0;
        Scanner sc = new Scanner(System.in);
        String[][] notasAlumnos = new String[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese " + (j + 1) + "°" + " nota del alumno " + (i+1));
                notas = sc.nextInt();
                sc.nextLine();
                notasAlumnos[i][j] = String.valueOf(notas);
                acumulador = acumulador + notas;
            }
            for (int j = 3; j <4 ; j++) {
                promedio = (acumulador/j);
                notasAlumnos[i][3]=String.valueOf(promedio);
                acumulador = 0; //dejamos nuestra variable en 0 para se resetee su valor y no interfiera con el promedio de los siguientes alumnos
            }
        }
        for (int j = 0; j <3 ; j++) {
            System.out.print("       Nota "+(j+1)+ " " );
        }
        for (int j = 3; j <4 ; j++) {
            System.out.print("Promedio");
        }
        System.out.println(" ");
        for (int i = 0; i < 4; i++) {
            System.out.print("alumno ");
            for (int j = 0; j < 4; j++) {
                System.out.print(notasAlumnos[i][j] + "    ");
            }
            System.out.println(" ");
        }
    }
}
