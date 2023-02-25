package Pruebas.ArrayBidemencional.POO.Pokemon;

public class Principal {
    public static void main(String[] args) {
        MetodosParaPokemon metodos = new MetodosParaPokemon();
        TypeFuego typeFuego = new TypeFuego();
        metodos.pokemonRegister();
        System.out.println("Pokemon ingresado\n" +
                "Presione la tecla \"enter\" para mostrar todos los datos del pokemon ingresado");
        metodos.showPokemon();
        System.out.println("Presione \"enter\" para mostrar el ataque realizado por el pokemon");
        typeFuego.attack();
        System.out.println("Finalizando prueba");
    }
}
