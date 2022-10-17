package homework_week_7;
//java program that Input number is odd or even

import java.util.Scanner;

public class Class1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();

        //check if even else odd
        if (number % 2 == 0) {
            System.out.println(number + "is an even number");
        } else {
            System.out.println(number + "is a odd number");
            scanner.close();
        }

    }
}
