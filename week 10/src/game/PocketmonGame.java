package game;

public class PocketmonGame {
    public static void main(String[] args) {
        Charizard charizard1 = new Charizard(36, 80);
        Pikachu pikachu1 = new Pikachu(14, 165);
        Wings wings = new Wings();
        Jetpack jetpack = new Jetpack();

        pikachu1.setFlyable(jetpack);
        charizard1.setFlyable(wings);
        charizard1.performFly();
        pikachu1.performFly();
    }
}