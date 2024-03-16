package Pruebas.ArrayBidemencional.POO.Mascotas;

import java.util.Scanner;

public class Mascotas {
    private String name, especie, nameDueno;
    Integer edadDueno;
    Scanner sc = new Scanner(System.in);

    public Mascotas(){
    };

    public Mascotas(String name, String especie, String nameDueno, Integer edadDueno) {
        this.name = name;
        this.especie = especie;
        this.nameDueno = nameDueno;
        this.edadDueno = edadDueno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        do {
            System.out.println("Ingrese el nombre de la mascota");
            name = sc.nextLine();
        }while (name.isBlank());
        this.name = name;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        do {
            System.out.println("Ingrese la especie de su mascota");
            especie= sc.nextLine();
        }while (especie.isBlank());
        this.especie = especie;
    }

    public String getNameDueno() {
        return nameDueno;
    }

    public void setNameDueno(String nameDueno) {
        do {
            System.out.println("Ingrese el nombre del dueño");
            nameDueno = sc.nextLine();
        }while (nameDueno.isBlank());
        this.nameDueno = nameDueno;
    }

    public Integer getEdadDueno() {
        return edadDueno;
    }

    public void setEdadDueno(Integer edadDueno) {
        do {
            System.out.println("Ingrese la edad del dueño");
            edadDueno = sc.nextInt();
        }while (edadDueno<0);
        this.edadDueno = edadDueno;
    }

    @Override
    public String toString() {
        return "Mascotas{" +
                "name='" + name + '\'' +
                ", especie='" + especie + '\'' +
                ", nameDueno='" + nameDueno + '\'' +
                ", edadDueno=" + edadDueno +
                '}';
    }
}
