package game;

public class pocketmongame {
    public static void main(String[] args) {
        Pocketmon pikachu = new Pocketmon();
        Pocketmon charizard = new Pocketmon();

        pikachu.setName("피카츄");
        charizard.setName("리자몽");

        System.out.println(pikachu.getName());
        pikachu.setLevel(5);
        charizard.setLevel(36);


        pikachu.evolve();
        pikachu.attack();
        charizard.evolve();

        System.out.println(pikachu.getLevel());
    }
}
