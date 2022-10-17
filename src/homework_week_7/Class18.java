package homework_week_7;
//java program to sum values of an array

import java.util.Scanner;
public class Class18 {
    public static void main(String[] args) {
        Class18 obj = new Class18();
        obj.sumOfArray();
    }
    public void sumOfArray() {
        int n, sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of elements you want in array: ");
        n = scanner.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements: ");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            sum = sum + a[i];
            scanner.close();
        }
    }
}
