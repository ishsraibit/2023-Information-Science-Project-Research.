package game;

public class PocketmonGame {
    public static void main(String[] args) {
        Charizard charizard = new Charizard();
        Pikachu pikachu = new Pikachu(14, 165);
        Squirtle squirtle = new Squirtle();

        squirtle.attack(); // execute override method
        pikachu.attack(); // execute super(base) class
        charizard.attack(); // execute super(base) class method and override method

        System.out.println(charizard.getName());
        charizard.setName("리자몽");
        System.out.println(charizard.getName());

        //squirtle.setLevel(1);
        squirtle.setHp(100);
        System.out.println(squirtle.getHp());
        System.out.println(pikachu.getHp());
        System.out.println(pikachu.getName());
        System.out.println(squirtle.getLevel());

    }
}