import java.util.Scanner;

public class FahrenheitToCelsiusDemo {
    public static void main(String[] args) {
        double fahrenheit, celsius;
        Scanner sc = new Scanner(System.in);
        fahrenheit = sc.nextDouble();

        celsius = (fahrenheit-32.0) * (5.0/9.0);
        System.out.println("화씨 :"+fahrenheit+"도는 섭씨 "+celsius+" 도 입니다");

    }
}
