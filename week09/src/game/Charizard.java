package game;

public class Charizard extends Pokemon {
    public Charizard() {
    }

    public Charizard(int level, int hp) {
        super();
        //this.hp=hp; this.level=level; // private access
        this.setHp(hp); //access by setter method
        this.setLevel(level);
    }
}