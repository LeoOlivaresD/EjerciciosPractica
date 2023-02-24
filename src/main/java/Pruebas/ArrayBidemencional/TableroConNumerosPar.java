package Pruebas.ArrayBidemencional;
//Escribir un programa que permita cargar en un arreglo de dos dimensiones de 4, 4 posiciones, números pares comenzando por el 12
public class TableroConNumerosPar {
    public static void main(String[] args) {
        int[][] n = new int [4][4]; //Creamos el arreglo

        int numPar = 12;

        for (int i = 0; i <n.length ; i++) { //Recorrimos el  array
            for (int j = 0; j <n.length ; j++) {

                if (numPar % 2 == 0){ //Definimos si hay numero par

                n[i][j] = numPar; // Si es par guardamos el número en el arreglo
                }else {
                    numPar = numPar +1; //si no es par le sumamos uno al valor y se guarda
                    n[i][j] = numPar;
                }
                numPar= numPar + 1; //al salir del if sumamos 1 mas al numero
            }
        }
        //Imprimiremos el Arreglo para visualizar el resultado
        System.out.println("Impriendo Arreglo en pantalla");
        for (int i = 0; i <n.length ; i++) {
            for (int j = 0; j <n.length ; j++) {
                System.out.print(n[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
