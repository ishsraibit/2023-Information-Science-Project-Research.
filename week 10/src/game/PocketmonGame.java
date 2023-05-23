package game;

public class PocketmonGame {
    public static void main(String[] args) {
        Charizard charizard1 = new Charizard(36, 80);
        Pikachu pikachu1 = new Pikachu(14, 165);

        Jetpack ISHSjetpack = new Jetpack();

        pikachu1.setFlyable(ISHSjetpack);
        charizard1.setFlyable(new Wings());
        charizard1.performFly();
        pikachu1.performFly();
    }
}