package game;

public class Pokemon {
    protected int level;
    protected int hp;
    protected String name;

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
    public void attack(){
        System.out.println(this.name +" does a wide area attack");
    }

    public void attack(Pokemon targetPokemon){
        if (targetPokemon instanceof Pikachu){
            System.out.println("pika pika~");

        }

        System.out.println(this.name+"does a attack to "+targetPokemon.name);
    }


}