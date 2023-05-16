package game;

public class Squirtle extends Pokemon{
    public Squirtle() {
        this.hp = 44; //access by setter method
        this.level = 1;
        this.name = "squirtle";
    }


    public Squirtle(int level, int hp) {
        super();
        this.hp=hp;
        this.level=level;
        this.name="squirtle";
        // private access
        this.setHp(hp); //access by setter method
        this.setLevel(level);
        this.setName("squirtle");



    }

    @Override
    public void attack() {
        System.out.println(this.getName()+" does a wide area Water Cannon attack");
    }
}
