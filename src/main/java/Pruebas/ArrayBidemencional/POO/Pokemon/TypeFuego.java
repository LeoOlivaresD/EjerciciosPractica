package Pruebas.ArrayBidemencional.POO.Pokemon;

import java.util.Scanner;

public class TypeFuego extends Pokemon {

    private String nameSecondEvolution, nameFirstEvolution, firstAttack, secondAttack;
    private Integer weight;

    Scanner sc = new Scanner(System.in);

    public TypeFuego(){
        super();
    }
    public TypeFuego(String name, String type, int numPokedex, int level, String nameSecondEvolution, String nameFirstEvolution, String firstAttack, String secondAttack, Integer weight) {
        super(name, type, numPokedex, level);
        this.nameSecondEvolution = nameSecondEvolution;
        this.nameFirstEvolution = nameFirstEvolution;
        this.firstAttack = firstAttack;
        this.secondAttack = secondAttack;
        this.weight = weight;
    }

    public String getNameFirstEvolution() {
        return nameFirstEvolution;
    }

    public void setNameFirstEvolution(String nameFirstEvolution) {
        System.out.println("What is the name from the first evolution?");
        nameFirstEvolution = sc.nextLine();
        this.nameFirstEvolution = nameFirstEvolution;
    }

    public String getNameSecondEvolution() {
        return nameSecondEvolution;
    }

    public void setNameSecondEvolution(String nameSecondEvolution) {
        System.out.println("What is the name from the second evolution?");
        nameSecondEvolution = sc.nextLine();
        this.nameSecondEvolution = nameSecondEvolution;
    }

    public String getFirstAttack() {
        return firstAttack;
    }

    public void setFirstAttack(String firstAttack) {
        System.out.println("What is the from the first attack ?");
        firstAttack = sc.nextLine();
        this.firstAttack = firstAttack;
    }

    public String getSecondAttack() {
        return secondAttack;
    }

    public void setSecondAttack(String secondAttack) {
        System.out.println("What is the from the second attack ?");
        secondAttack = sc.nextLine();
        this.secondAttack = secondAttack;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        System.out.println("How much weight the pokemon ?");
        weight = sc.nextInt();
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "TypeFuego{" +
                "nameSecondEvolution='" + nameSecondEvolution + '\'' +
                ", nameFirstEvolution='" + nameFirstEvolution + '\'' +
                ", firstAttack='" + firstAttack + '\'' +
                ", secondAttack='" + secondAttack + '\'' +
                ", weight=" + weight +
                "} " + super.toString();
    }

    @Override
    public void attack() {
        System.out.println(getName() + " ahh atacado con: " + firstAttack);
    }
}
