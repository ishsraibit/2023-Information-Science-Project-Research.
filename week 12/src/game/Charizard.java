package game;

public class Charizard extends Pokemon{
    public Charizard() {
        this.hp = 78;
        this.level = 36;
        this.name = "charizard";
    }
    public Charizard(int level, int hp) {
        super();
        this.hp = hp;
        this.level = level;
        this.name = "charizard";
    }

    void fireInfo(){
        System.out.println("fire~");
    }
    @Override
    public void attack() {
        System.out.println(this.name + " does a wide area Flamethrower attack");
    }
}