package Pruebas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MetodosCuenta {
    List<Cuentas> listaCuentas = new ArrayList<>();

    public void guardarCuenta(Cuentas cuenta){
        listaCuentas.add(cuenta);

    }
    public void mostrarCuenta(){
        for (Cuentas cuentas:listaCuentas) {
            System.out.println(cuentas.toString());
        }
    }
    public void ordenarPorID(){
        Collections.sort(listaCuentas);
        for (Cuentas cuentas:listaCuentas){
            System.out.println(cuentas.toString());
        }
    }
}
