package kr.icehs.science;

class Singleton{
    private static Singleton s = new Singleton(); //unique object
    private Singleton() {
        System.out.println("One Object Created!");
    }

    public static Singleton getInstance() {
        return s;
    }
}
public class SinglentonDemo {
    public static void main(String[] args) {
        //Singleton s = new Singleton();  // private acess
        System.out.println(Singleton.getInstance().toString());
    }

}
