package Pruebas.ArrayBidemencional.POO.Trabajadores;
/*
Una compañía de transporte cuenta con cinco choferes, de los cuales se conoce:
nombre, horas trabajadas cada día de la semana (seis días) y sueldo por hora.
Realice un algoritmo que:
a) Calcule el total de horas trabajadas a la semana para cada trabajador.
b) Calcule el sueldo semanal para cada uno de ellos.
c) Calcule el total que pagará la empresa.
d) Indique el nombre del trabajador que labora más horas el día lunes.
e) Imprima un reporte con todos los datos anteriores
* */

public class Principal {
    public static void main(String[] args) {
    MetodosTrabajador metodos = new MetodosTrabajador();
    metodos.datosTrabajador();
    metodos.mostrarDatosTrabajador();

    }
}
