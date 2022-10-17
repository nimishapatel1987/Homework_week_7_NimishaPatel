package homework_week_7;

import java.util.Scanner;

public class Class3 {
    public static void main(String[] args) {
        marksheet();
    }

    public static void marksheet() {
        Scanner scanner = new Scanner(System.in);
        int maths, science, english, total;
        double percentage;
        String result = null;
        String grade = null;

        System.out.println("enter Name  : ");
        String name = scanner.nextLine();

        System.out.println("Enter roll number : ");
        int rollnum = scanner.nextInt();

        System.out.println("Maths : ");
        maths = scanner.nextInt();

        System.out.println("Science : ");
        science = scanner.nextInt();

        System.out.println("English : ");
        english = scanner.nextInt();
        total = maths + english + science;
        int avg = total / 3;
        System.out.println("Your marks is :" + total);
        System.out.println("Your percentage  is :" + avg);
        if (avg >= 80) {
            grade = "A+";
            System.out.println("grade is: " + grade);
        } else if (avg > 60) {
            grade = "A";
            System.out.println("grade is:" + grade);
        } else if (avg > 50) {
            grade = "B";
            System.out.println("grade is:" + grade);
        } else if (avg > 35) {
            grade = "C";
            System.out.println("Grade is:" + grade);
        }
        if (avg >= 35) {
            result = "Pass";
        } else {
            result = "Fail";
        }
        System.out.println("Result is : " + result);
        System.out.println("------------------------------------------------------------");
        System.out.println("|                                                          |");
        System.out.println("|                   Mark Sheet                             |");
        System.out.println("|----------------------------------------------------------|");
        System.out.println("|     Name               :             " + name + "        |");
        System.out.println("|   Roll no              :           " + rollnum + "       |");
        System.out.println("|----------------------------------------------------------|");
        System.out.println("|     Subjects           :                                 |");
        System.out.println("|__________________________________________________________|");
        System.out.println("|      Maths             :         " + maths + "           |");
        System.out.println("|      Science           :         " + science + "         |");
        System.out.println("|      English           :         " + english + "         |");
        System.out.println("|----------------------------------------------------------|");
        System.out.println("|      Total             :         " + total + "           |");
        System.out.println("| ---------------------------------------------------------|");
        System.out.println("|     Percentage         :        " + avg + "              |");
        System.out.println("|       Result           :        " + result + "           |");
        System.out.println("|      Grade             :         " + grade + "           |");
        System.out.println("|----------------------------------------------------------|");
        scanner.close();


    }
}
