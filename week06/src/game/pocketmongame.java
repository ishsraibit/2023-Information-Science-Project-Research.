package game;

public class pocketmongame {
    public static void main(String[] args) {
        Pocketmon pikachu = new Pocketmon();
        Pocketmon charizard = new Pocketmon();

        pikachu.name = "피카츄";
        charizard.name = "리자몽";
        pikachu.level = 5;
        charizard.level = 36;

        System.out.print(pikachu.name+"가 ");
        pikachu.evolve();
        pikachu.attack();
        charizard.evolve();
    }
}
