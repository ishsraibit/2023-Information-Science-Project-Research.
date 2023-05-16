package game;

public class PokemonGame {
    public static void main(String[] args) {
        Charizard charizard = new Charizard();
        Pikachu pikachu = new Pikachu();

        System.out.println(charizard.getName());
        charizard.setName("리자몽");
        System.out.println(charizard.getName());
        Squirtle squirtle = new Squirtle();
        squirtle.setLevel(1);
        squirtle.setHp(100);
        System.out.println(squirtle.getHp());
    }
}