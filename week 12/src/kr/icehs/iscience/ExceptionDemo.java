package kr.icehs.iscience;


import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numerator = scanner.nextInt();
        int denominator = scanner.nextInt();

        System.out.println(numerator/denominator);
    }
}
