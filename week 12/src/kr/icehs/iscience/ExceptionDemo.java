package kr.icehs.iscience;


import com.sun.jdi.event.ExceptionEvent;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
            int numerator = scanner.nextInt(); //inputmismatchexception
            int denominator = scanner.nextInt(); //inputmismatchexception

            System.out.println(numerator/denominator);
        }catch (InputMismatchException err){
            System.out.println("Input data must be integer!");
            System.out.println(err.getMessage());
        }catch (ArithmeticException err) {
            System.out.println("The denomanator cannot be zero.");
            System.out.println(err.getMessage());
        }catch (Exception other){
            System.out.println("Error Occur");
            System.out.println(other.getMessage());
        }finally {
            System.out.println("Exit!");
        }
        System.out.println("Program terminated.");
    }
}
