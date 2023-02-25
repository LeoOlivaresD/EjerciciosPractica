package Pruebas.ArrayBidemencional.POO.Pokemon;

import java.util.Scanner;

public abstract class Pokemon {
    private String name, type;
    private int numPokedex, level;

    Scanner sc = new Scanner(System.in);

    public Pokemon(String name, String type, int numPokedex, int level) {
        this.name = name;
        this.type = type;
        this.numPokedex = numPokedex;
        this.level = level;
    }

    public Pokemon() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("Insert pokemon name");
        name = sc.nextLine();
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        System.out.println("What is he pokemon type?");
        type =sc.nextLine();
        this.type = type;
    }

    public int getNumPokedex() {
        return numPokedex;
    }

    public void setNumPokedex(int numPokedex) {
        System.out.println("Insert the number from pokedex for the pokemon");
        numPokedex = sc.nextInt();
        this.numPokedex = numPokedex;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        System.out.println("Insert level from the pokemon");
        level = sc.nextInt();
        this.level = level;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", numPokedex=" + numPokedex +
                ", level=" + level +
                '}';
    }
    public void pokemonRegister(){
    }
    public abstract void attack();
}
