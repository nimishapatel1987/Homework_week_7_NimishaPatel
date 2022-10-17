package homework_week_7;
//java program to check if enter number is "POSITIVE", "NEGATIVE" or "ZERO"

public class Class16 {
    public static void main(String[] args) {
        //number to be check
        int num = 912;
        //checks the number is greater than 0 or not
        if (num > 0) {
            System.out.println("The number is positive");
        }
        //checks the number is less than o or not
        else if (num < 0) {
            System.out.println("The number is negative");
        }
        //executes when the above two condition return false
        else {
            System.out.println("The number is zero");
        }
    }
}
