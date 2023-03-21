public class TypeDemo {
    public static void main(String[] args) {
        char c ='\uAC00';
        System.out.println(c);
        System.out.println((int)c);
        System.out.println( 0.1 + 0.2);

        int intValue = 10;
        byte byteValue = (byte)intValue;
        System.out.println(byteValue);
        intValue = 127 ;
        byteValue = (byte) intValue;
        System.out.println(byteValue);
    }
}
