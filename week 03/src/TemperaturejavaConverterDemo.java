import java.util.Scanner;

public class TemperaturejavaConverterDemo {


    public static void main(String[] args) {
        double fahrenheit =0.0;
        double celsius = 0.0;
        Scanner scanner = new Scanner(System.in);
        //1) Fahrenheit To Celsius 2)Celsius To Fahrenheit 3)Exit ;
        while (true){
            System.out.print("1) Fahrenheit To Celsius 2)Celsius To Fahrenheit 3)Exit");
            int menu = scanner.nextInt();
            if(menu == 1){
                System.out.print("Enter temperature in Fahrenhiet : ");
                fahrenheit = scanner.nextDouble();
                celsius = (fahrenheit-32.0) * (5.0/9.0);
                System.out.println(fahrenheit+"degrees Rahrenheit is "+celsius+" degrees Celsius");
            } else if(menu == 2){
                //for you (°C × 9/5) + 32 = °F
                System.out.print("Enter temperature in Celsius : ");
                fahrenheit = (celsius * 9.0/5.0)+32.0;
                celsius = scanner.nextDouble();
                System.out.println(celsius+" degrees Celsius is "+fahrenheit+"degrees Rahrenheit ");

            } else if(menu == 3){
                System.out.println("Program finishedd!");
                break;
            }else{
                System.out.print("Please choose from the given menu : ");
            }
        }
    }
}