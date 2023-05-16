package game;

public class Charizard extends Pokemon {
    public Charizard() {
        this.name = "charizard";
        this.hp=78; //access by setter method
        this.level=36;

    }

    public Charizard(int level, int hp) {
        super();
        this.hp=hp;
        this.level=level;
        this.name="charizard";
        // private access
        this.setHp(hp); //access by setter method
        this.setLevel(level);
        this.setName("charizard");

    }

    @Override
    public void attack() {
        super.attack();
        System.out.println(this.getName()+" does a wide area Flamethrower attack.");
    }
}