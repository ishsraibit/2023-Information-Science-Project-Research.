package game;

public class PokemonGame {
    public static void main(String[] args) {
        Pokemon charizard1 = new Charizard(36, 80);  // upcast
        Pokemon pikachu1 = new Pikachu(14, 165);  // upcast
        JetPack ISHSjetPack = new JetPack();

        pikachu1.setFlyable(ISHSjetPack);
        charizard1.setFlyable(new Wings());
        charizard1.performFly();
        pikachu1.performFly();

        pikachu1.attack();
        charizard1.attack();

        // below methods can not use with parent's variable
//        pikachu1.electricInfo();
//        charizard1.fireInfo();

        //Pikachu pikachu2 = new Pokemon();  // downcast is impossible
        Pikachu pikachu2 = (Pikachu) pikachu1;   // downcast success
        pikachu2.electricInfo();
        //Charizard charizard2 = (Pikachu) charizard1;  // incompatible
        Charizard charizard2 = (Charizard) charizard1;   // downcast success
        charizard2.fireInfo();

        Balloon ISHSballoon = new Balloon();
        pikachu1.setFlyable(ISHSballoon);
        pikachu1.performFly();
    }
}