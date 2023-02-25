package Pruebas.ArrayBidemencional.POO.Pokemon;

public class MetodosParaPokemon {
    Pokemon[][] matrizPokemon = new Pokemon[2][1];

    public void pokemonRegister(){
        for (int i = 0; i < 2 ; i++) {
            TypeFuego typeFuego = new TypeFuego();
            typeFuego.setName(typeFuego.getName());
            matrizPokemon[i][0] = typeFuego;
            for (int j = 0; j < 1 ; j++) {
               typeFuego.setNameFirstEvolution(typeFuego.getNameFirstEvolution());
                typeFuego.setNameSecondEvolution(typeFuego.getNameSecondEvolution());
                typeFuego.setType(typeFuego.getType());
                typeFuego.setLevel(typeFuego.getLevel());
                typeFuego.setWeight(typeFuego.getWeight());
                typeFuego.setNumPokedex(typeFuego.getNumPokedex());
                typeFuego.setFirstAttack(typeFuego.getFirstAttack());
                typeFuego.setSecondAttack(typeFuego.getSecondAttack());
                matrizPokemon[i][j]=typeFuego;
            }
        }

    }
    public void showPokemon(){
        for (int i = 0; i < 2 ; i++) {
            System.out.print(matrizPokemon[i][0].getName() + " ");
            for (int j = 0; j < 1 ; j++) {
                System.out.print(matrizPokemon[i][j].toString());
            }
            System.out.println(" ");
        }
    }
}
