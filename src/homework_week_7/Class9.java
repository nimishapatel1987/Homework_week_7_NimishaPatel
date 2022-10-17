package homework_week_7;
//input any alphabet from "A" to "F" and print their city bane accordingly using switch statement

import java.util.Scanner;

public class Class9 {
    public static void main(String[] args) {
        myCityName();
    }
    public static void myCityName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter String Name ");
        String input = scanner.next();
        switch (input) {
            case "a":
            case "A":
                System.out.println("Amritsar");
                break;
            case "b":
            case "B":
                System.out.println("Bihar");
            case "c":
            case "C":
                System.out.println("Cambridge");
            case "d":
            case "D":
                System.out.println("Delhi");
            case "e":
            case "E":
                System.out.println("East London");
            case "f":
            case "F":
                System.out.println("Faradapur");
            case "Invalid Entry":
                System.out.println("Invalid Entry");
                scanner.close();
        }
    }

}
