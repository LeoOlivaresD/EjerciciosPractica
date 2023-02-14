import java.util.Scanner;

public class IfSwitchDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x , y , resultado, operacion, opcion= 0;
        boolean sw = true;


        System.out.println("Ingrese un  numero");
        x = sc.nextInt();
        System.out.println("Ingrese un segundo numero");
        y = sc.nextInt();

        System.out.println("Elija la operacion \n" +
                "1:suma \n" +
                "2: resta\n" +
                "3:multiplicacion \n" +
                "4:division");

        operacion = sc.nextInt();

        if (operacion == 1){
            resultado = x + y;
            System.out.println("el resultado es: " + resultado);

        }else if ( operacion ==2){
            resultado = x-y;
            System.out.println("el resultado es: " + resultado);
        } else if (operacion == 3) {
            resultado = x*y;
            System.out.println("el resultado es: " + resultado);
        } else if (operacion == 4) {
            resultado = x / y;
            System.out.println("el resultado es: " + resultado);
        }else {
            System.out.println("Opcion incorrecta, vuelva a intentarlo");
        }

        do{
            System.out.println("Elija algunas de las siguientes opciones \n" +
                    "1: rojo\n" +
                    "2: azul\n" +
                    "3:verde \n" +
                    "4: rosa");
            opcion = sc.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("imprimiste el color rojo");
                    sw = false;
                    break;
                case 2:
                    System.out.println("elegiste el azul");
                    sw = false;
                    break;
                case 3:
                    System.out.println("Tu color es verde");
                    sw = false;
                    break;
                case 4:
                    System.out.println("Te gusta el rosa");
                    sw = false;
                    break;
                default:
                    System.out.println("no elegiste ninguna opcion valida");
                    sw = true;
            }
        }while (sw);

        System.out.println("Felicidades pasaste la prueba del if, switch y bucle do while");

    }
}
