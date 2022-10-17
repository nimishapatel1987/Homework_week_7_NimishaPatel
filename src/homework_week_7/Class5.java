package homework_week_7;
//WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross salary
//HRA = Basic salary 10%
//DA = Basic salary 8%
//TA = Basic salary 9%
//PF = Basic Salary 20%
//Gross salary = basic salary+HRA+DA+TA+PF

import java.util.Scanner;

public class Class5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int employeeID, basicSalary, hra, ta, da, pf, grosssalary;
        String employeeName;

        System.out.println("Enter Employee ID");
        employeeID = scanner.nextInt();

        System.out.println("Enter Employee Name");
        employeeName = scanner.next();

        System.out.println("Enter basic salary");
        basicSalary = scanner.nextInt();

        hra = (10 * basicSalary) / 100;
        da = (8 * basicSalary) / 100;
        ta = (9 * basicSalary) / 100;
        pf = (20 * basicSalary) / 100;
        grosssalary = basicSalary + hra + da + ta + pf;

        System.out.println("|----------------------------------------|");
        System.out.println("|              Salary Slip               |");
        System.out.println("|--------------------------------------- |");
        System.out.println("|Employee ID            : 2564           |");
        System.out.println("|Employee Name          : Jay            |");
        System.out.println("|----------------------------------------|");
        System.out.println("|Basic Salary           : 25000.0        |");
        System.out.println("|HRA 10%                : 2500.0         |");
        System.out.println("|TA 8%                  : 2250.0         |");
        System.out.println("|DA 9%                  : 2000.0         |");
        System.out.println("|PF -20%                : 5000.0         |");
        System.out.println("|----------------------------------------|");
        System.out.println("|Gross Salary           : 26750.0        |");
        System.out.println("|========================================|");
        scanner.close();
    }
}
