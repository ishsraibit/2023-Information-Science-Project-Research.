package game;

public class PocketmonGame {
    public static void main(String[] args) {
        Pikachu pikachu = new Pikachu();
        Squirtle squirtle = new Squirtle();
        squirtle.setHp(100);
        squirtle.setLevel(1);
        System.out.println(squirtle.getHp());
        Charizard charizard = new Charizard();
        System.out.println(charizard.getName());

    }
}
