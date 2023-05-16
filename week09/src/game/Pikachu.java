package game;

public class Pikachu extends Pokemon{
    public Pikachu() {
        this.setHp(35); //access by setter method
        this.setLevel(1);
        this.setName("pikachu");
    }

    public Pikachu(int level, int hp) {
        super();
        //this.hp=hp; this.level=level; // private access
        this.setHp(hp); //access by setter method
        this.setLevel(level);
        this.setName("pikachu");

    }

}
