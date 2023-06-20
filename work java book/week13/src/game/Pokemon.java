package game;

public abstract class Pokemon extends Animation {
    protected int level;
    protected int hp;
    protected String name;
    FlyBehavior flyable;  // association

    public void setFlyable(FlyBehavior flyable) {
        this.flyable = flyable;
    }

    public void performFly(){
        System.out.print(this.name + " ");
        this.flyable.fly();
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void attack();

    public void attack(Pokemon targetPokemon) throws Exception{
        if(targetPokemon instanceof Digimon){
            throw new Exception("포켓몬이 아닙니다");
        }

        if (this instanceof Pikachu){
            System.out.println("pika pika~");
        }
        System.out.println(this.name + " does a attack to " + targetPokemon.name);
    }
}