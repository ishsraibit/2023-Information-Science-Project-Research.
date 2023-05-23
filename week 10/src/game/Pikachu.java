package game;

public class Pikachu extends Pokemon {
    public Pikachu() {
        this.hp = 35;  // protected access (without setter)
        this.level = 1;
        this.name = "pikachu";
    }

    public Pikachu(int level, int hp) {
        super();
        this.hp = hp;  // protected access
        this.level = level;
        this.name = "pikachu";
    }



    void electricInfo(){
        System.out.println("electric~");
    }

    @Override
    public void attack() {
        System.out.println(this.name + " does a wide area Electric attack");
    }
}