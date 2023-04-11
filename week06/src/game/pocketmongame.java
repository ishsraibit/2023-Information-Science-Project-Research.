package game;

public class pocketmongame {
    public static void main(String[] args) {
        Pocketmon pikachu = new Pocketmon("피카츄", 5, 100);
        Pocketmon charizard = new Pocketmon("리자몽",36,800);
        Pocketmon squirtle = new Pocketmon("꼬부기");
        Pocketmon bulbasaur = new Pocketmon();


        bulbasaur.setName("이상해");
        System.out.println(squirtle.getLevel());
        System.out.println(squirtle.getHp());
        System.out.println(squirtle.getName());
        squirtle.setName("어니부기");

       // pikachu.setName("피카츄");
        //charizard.setName("리자몽");

        System.out.println(pikachu.getName());
      //  pikachu.setLevel(5);
        //charizard.setLevel(36);


        pikachu.evolve();
        charizard.attack(pikachu);
        charizard.evolve();

        System.out.println(pikachu.getLevel());
    }
}
