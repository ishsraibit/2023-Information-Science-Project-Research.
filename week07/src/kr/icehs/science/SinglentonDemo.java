package kr.icehs.science;

class Singleton{
    private Singleton() {
        System.out.println("단 하나의 객체!");
    }
}
public class SinglentonDemo {
    public static void main(String[] args) {
        //Singleton s = new Singleton();  // private acess
    }

}
