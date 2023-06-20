package game;

public class PocketmonGame {
    public static void main(String[] args) {

        Pokemon charizard1 = new Charizard(36, 80);  // upcast
        Pokemon pikachu1 = new Pikachu(14, 165);  // upcast
        Jetpack ISHSjetPack = new Jetpack();
        Digimon d1 = new Agumon();

        pikachu1.setFlyable(ISHSjetPack);
        //charizard1.setFlyable(new Wings());

        System.out.println(pikachu1);

        try {
            pikachu1.attack(d1);
        } catch (Exception e){
            System.out.println(e.getMessage());

        }

        //anonymous object as parameter
        charizard1.setFlyable(new Wings(){
            @Override
            public void fly() {
                System.out.println("fly with Iron Wings!");
            }
        });
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