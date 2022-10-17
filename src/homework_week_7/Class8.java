package homework_week_7;
//Input any alphabet from "A" to "F" and print their city name accordingly
//if any other alphabet should be invalid entry

import java.util.Scanner;

public class Class8 {
    public void cityName() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any Alphabet: ");
        char city = input.next().charAt(0);

        if (city == 'a' || city == 'A') {
            System.out.println("Amritsar");
        } else if (city == 'b' || city == 'B') {
            System.out.println("Bihar");
        } else if (city == 'c' || city == 'C') {
            System.out.println("Cambridge");
        } else if (city == 'd' || city == 'D') {
            System.out.println("Delhi");
        } else if (city == 'e' || city == 'E') {
            System.out.println("East London");
        } else if (city == 'f' || city == 'F') {
            System.out.println("Faradapur");
        } else {
            System.out.println("Invalid Entry");
        }
    }
}

