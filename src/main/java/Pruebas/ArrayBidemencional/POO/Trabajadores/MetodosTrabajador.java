package Pruebas.ArrayBidemencional.POO.Trabajadores;

import java.util.Scanner;

public class MetodosTrabajador {
    Scanner sc = new Scanner(System.in);
    Trabajador[][] arregloTrabajador = new Trabajador[5][7];
    public void datosTrabajador(){
        for (int i = 0; i <5 ; i++) {
            Trabajador trabajador = new Trabajador();
            trabajador.setNombreTrabajador(trabajador.getNombreTrabajador());
            trabajador.setSueldoPorHora(trabajador.getSueldoPorHora());
            arregloTrabajador[i][0]=trabajador;
            for (int j = 0; j <6 ; j++) {
                System.out.println("dia " + (j +1) );
                trabajador.setHorasTrabajadas(trabajador.getHorasTrabajadas());
                arregloTrabajador[i][j+1]=trabajador;
            }
        }
    }

    public void mostrarDatosTrabajador(){
        for (int i = 0; i <1 ; i++) {
            System.out.print("Trabajador");
            for (int j = 1; j <7 ; j++) {
                System.out.print("Dia " + j);
            }
        }
        System.out.println(" ");

        for (int i = 0; i <5 ; i++) {
            System.out.print(arregloTrabajador[i][0].nombreTrabajador + " ");
            for (int j = 1; j < 7 ; j++) {
                System.out.print("Horas trabajadas" +  " " + arregloTrabajador[i][j].horasTrabajadas + " ");
            }
            System.out.println(" ");
        }
    }
}
