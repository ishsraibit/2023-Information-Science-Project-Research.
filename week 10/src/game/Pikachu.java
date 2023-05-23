package game;

public class Pikachu extends Pokemon{
    public Pikachu() {
        //private->protecteed
        this.hp=35; // protected access(without setter)
        this.level=1;
        this.name="pikachu";
    }

    public Pikachu(int level, int hp) {
        super();
        this.hp=hp;
        this.level=level; // protected access
        this.name = "pikachu";
        this.setHp(hp); //access by setter method
        this.setLevel(level);
        this.setName("pikachu");

    }

    @Override
    public void attack() {
        //super.attack();
        System.out.println(this.name + "does a wide area Electric attack");
    }

    void electricInfo(){
        System.out.println("electric~");
    }

}
