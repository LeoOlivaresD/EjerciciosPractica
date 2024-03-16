package Pruebas.ArrayBidemencional;
/*Ejercicio
Llevar a cabo un programa que permita cargar completamente con numeros 5 una matriz de 4 x 5
* */

public class LlenarMatrizCon5 {
    public static void main(String[] args) {
        int num = 5;
        int[][] tablero = new int[4][5];

        //Recorrido y llenado del tablero

        for (int i = 0; i <4 ; i++) {
            for (int j = 0; j <5 ; j++) {
                tablero[i][j]= num;
            }
        }
        System.out.println("Impresion del tablero");
        for (int i = 0; i < tablero.length ; i++) {
            for (int j = 0; j <= tablero.length ; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
