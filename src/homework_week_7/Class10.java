package homework_week_7;
//java program to input any two number and ask user to enter their symbol
//find addition(+), Subtraction(-), multiplication(x), division(/) according to their symbol

import java.util.Scanner;

public class Class10 {
    public static void main(String[] args) {
        int first, second, add, subtract, multiply;
        float devide;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two numbers: ");
        first = scanner.nextInt();
        second = scanner.nextInt();

        add = first + second;
        subtract = first - second;
        multiply = first * second;
        devide = (float) first / second;

        System.out.println("sum = " + add);
        System.out.println("Difference = " + subtract);
        System.out.println("Multiplication = " + multiply);
        System.out.println("Divison = " + devide);
        scanner.close();
    }
}
