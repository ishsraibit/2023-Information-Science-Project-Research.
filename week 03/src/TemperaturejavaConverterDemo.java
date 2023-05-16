import java.sql.SQLOutput;
import java.util.Scanner;

public class TemperaturejavaConverterDemo {


    public static void main(String[] args) {
        double fahrenheit = 0.0 ;
        double celsius = 0.0;

        Scanner scanner = new Scanner(System.in);
        //1) Fahrenheit To Celsius 2)Celsius To Fahrenheit 3)Exit ;
        while (true){
            System.out.print("1) Fahrenheit To Celsius 2)Celsius To Fahrenheit 3)Exit");
            String menu = scanner.nextLine();
            if (menu.equals("3")){
                System.out.println("Program Finished!");
                break;
            }
            //if(menu.eq "1")
            switch (menu){
                case "1":

                    System.out.print("Enter temperature in Fahrenhiet : ");
                    fahrenheit = scanner.nextDouble();
                    celsius = (fahrenheit-32.0) * (5.0/9.0);
                    System.out.println(fahrenheit+"degrees Rahrenheit is "+celsius+" degrees Celsius");
                    break;
                case "2":
                //for you 2(°C × 9/5) + 32 = °F
                    System.out.print("Enter temperature in Celsius : ");
                    fahrenheit = (celsius * (9.0/5.0)) + 32.0;
                    celsius = scanner.nextDouble();
                    System.out.println(celsius+" degrees Celsius is "+fahrenheit+"degrees Rahrenheit ");
                    break;

                default:
                    System.out.print("Please choose from the given menu : ");
                    break;
            }
        }
    }
}

