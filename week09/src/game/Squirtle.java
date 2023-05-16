package game;

public class Squirtle extends Pokemon{
    public Squirtle() {
        this.setHp(44); //access by setter method
        this.setLevel(1);
        this.setName("squirtle");
    }


    public Squirtle(int level, int hp) {
        super();
        //this.hp=hp; this.level=level; // private access
        this.setHp(hp); //access by setter method
        this.setLevel(level);
        this.setName("squirtle");



    }

    @Override
    void attack() {
        System.out.println(this.getName()+" does a wide area Water Cannon attack");
    }
}
