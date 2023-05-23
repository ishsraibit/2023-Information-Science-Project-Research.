package game;

public class Squirtle extends Pokemon {
    public Squirtle() {
        this.hp = 44;
        this.level = 1;
        this.name = "squirtle";
    }

    public Squirtle(int level, int hp) {
        super();
        this.hp = hp;
        this.level = level;
        this.name = "squirtle";
    }

    @Override
    public void attack() {
        System.out.println(this.name + " does a wide area Water Cannon attack");
    }

    void waterInfo(){
        System.out.println("water...");
    }
}