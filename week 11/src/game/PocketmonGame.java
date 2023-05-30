package game;

public class PocketmonGame {
    public static void main(String[] args) {
        Pokemon charizard1 = new Charizard(36, 80); //upcast
        Pokemon pikachu1 = new Pikachu(14, 165); //upcast

        Jetpack ISHSjetpack = new Jetpack();

        pikachu1.setFlyable(ISHSjetpack);
        charizard1.setFlyable(new Wings());
        charizard1.performFly();
        pikachu1.performFly();

        pikachu1.attack();
        charizard1.attack();

        pikachu1.electricInffo();
        charizard1.fifeInfo();
        //  can not use with parent's variable

        Pikachu pikachu2 = new Pokemon() //downcast is impossible
        Pikachu pikachu2 = (Pikachu) pikachu1; //downcast success
        pikachu2.electricInfo();

        //Charizard charizard2 = (Pikachu) charizard1; //imcompativle
        Charizard charizard2 = (Charizard) charizard1;
        charizard2.fireInfo();
    }
}

