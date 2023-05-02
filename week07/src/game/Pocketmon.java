package game;

public class Pocketmon {
    //encapsulation 캡슐화
    private String name;
    private int level;
    private int hp;

    private static int count = 0; //정적 변수(클래스 변수, 필드)
    //constructor


    public Pocketmon(String name, int level, int hp) {
        System.out.println("포켓몬 객체 생성(매개변수3개 생성자");
        this.name = name;
        this.level = level;
        this.hp = hp;
        count++;
    }

    public static int getCount() {
        return count;
    }

    public Pocketmon(String name) {
        //this.name = name;
        this(name, 1,50);
        System.out.println("포켓몬 객체 생성(매개변수1개 생성자");
    }

    public Pocketmon() {
        System.out.println("포켓몬 객체 생성(기본 생성자)");

    }

    //getter, settermethods
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
        System.out.println(this.name+"가(이)"+ level + "레벨로 성장합니다.");

    }
    void attack(Pocketmon pocketmon){
        System.out.println(this.name+"가(이)"+ pocketmon.name +"에게 기본 공격을 시전합니다.");

    }
    void attack(){
        System.out.println(this.name+"가(이) 광역 공격을 시전합니다.");

    }

}
