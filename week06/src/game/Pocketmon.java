package game;

public class Pocketmon {
    //encapsulation
    private String name;
    private int level;
    private int hp;

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

    public String getName(){
        return name;

    }

    public void setName(String name){
        this.name = name;
        //name = n;
    }
    //methods
    void evolve(){
        level = level+1;
        hp = hp + 10;
        System.out.println( level + "레벨로 성장합니다.");

    }
    void attack(){
        System.out.println("기본 공격을 시전합니다.");
    }

}
