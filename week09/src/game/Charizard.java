package game;

public class Charizard extends Pokemon {
    public Charizard() {
        this.setName("charizard");
        this.setHp(78); //access by setter method
        this.setLevel(36);

    }

    public Charizard(int level, int hp) {
        super();
        //this.hp=hp; this.level=level; // private access
        this.setHp(hp); //access by setter method
        this.setLevel(level);
        this.setName("charizard");

    }
}