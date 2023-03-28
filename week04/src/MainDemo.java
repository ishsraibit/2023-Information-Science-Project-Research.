public class MainDemo {
    //javac MainDemo.java-encoding utf-8
    //java MainDemo 7 9
    //16

    //or
    //InteliJidea
    //Run -> Edit Configurations -> Build and run -> Program arguments

    public static void main(String[] args) {
        System.out.println("length of array : "+ args.length);
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.println(a+b);
    }
}
