package game;

public class Pocketmon {
    String name;
    int level;

    int hp;
    //methods
    void evolve(){
        level = level+1;
        hp = hp + 10;
        //System.out.println(""+ level + "로 성장합니다.");
        System.out.println(level + "레벨로 성장합니다.");

    }
    void attack(){
        System.out.println("기본 공격을 시전합니다.");
    }

}
