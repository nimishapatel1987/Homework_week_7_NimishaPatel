package homework_week_7;
//java program to input any number and find out if it's odd or even

import java.util.Scanner;

public class Class6 {
    public static void main(String[] args) {

        int num;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        num = scanner.nextInt();

        if (num % 2 == 0) {
            System.out.println("\nIt is an Even number");
        } else {
            System.out.println("\nIs is an Odd number");
            scanner.close();
        }
    }
}
