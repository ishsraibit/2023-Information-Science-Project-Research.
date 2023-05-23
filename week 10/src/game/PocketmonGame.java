package game;

public class PocketmonGame {
    public static void main(String[] args) {
        // Pokemon pokemon1 = new Pokemon();  // abstract class can not initiate instance
        Trainer trainer1 = new Trainer();  // default constructor by jdk

        Squirtle squirtle1 = new Squirtle();
        Charizard charizard1 = new Charizard(36, 80);
        Pokemon pokemon = new Pikachu(1, 35);  // upcast
        Pikachu pikachu1 = new Pikachu(14, 165);
        //Pikachu pikachu3 = new Squirtle(1, 45);  // Squirtle is NOT a Pikachu.

        pikachu1.attack(squirtle1);  // compatible
        pikachu1.attack(charizard1);  // compatible
        //pikachu1.attack(trainer1);  // incompatible
        charizard1.attack(pikachu1);

        System.out.println(pokemon);
        System.out.println(pikachu1);

        pikachu1.electricInfo();

        Pikachu pikachu2 = (Pikachu) pokemon;  // downcast
        //Squirtle squirtle1 = (Squirtle) pokemon;

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