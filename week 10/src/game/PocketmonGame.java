package game;

public class PocketmonGame {
    public static void main(String[] args) {
        Squirtle squirtle = new Squirtle();
        Pokemon pokemon = new Pikachu(1, 35);  // upcast
        Pikachu pikachu1 = new Pikachu(14, 165);
        //Pikachu pikachu3 = new Squirtle(1, 45);  // Squirtle is NOT a Pikachu.

        System.out.println(pokemon);
        System.out.println(pikachu1);

        pikachu1.electricInfo();

        Pikachu pikachu2 = (Pikachu) pokemon;  // downcast
        Squirtle squirtle1 = (Squirtle) pokemon;
        /*
        Exception in thread "main" java.lang.ClassCastException: class game.Pikachu cannot be cast to class game.Squirtle (game.Pikachu and game.Squirtle are in unnamed module of loader 'app')
	at game.PokemonGame.main(PokemonGame.java:14)
         */

        //pokemon.electricInfo();  // can not access child's method
        pikachu2.electricInfo();  // accessible
        System.out.println(pokemon.getHp());
        System.out.println(pikachu2.getHp());

        System.out.println(pikachu2);  // same address (pokemon)

        pikachu1.attack();
        pokemon.attack();

        squirtle1.attack();
    }
}