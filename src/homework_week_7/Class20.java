package homework_week_7;
//java program to test if an  array contains a specific value

public class Class20 {
    public static void main(String[] args) {
        Class20 obj = new Class20();
        obj.myArray();
    }

    public void myArray() {
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int tofind = 3;
        boolean found = false;
        for (int n : num) {
            if (n == tofind) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println(tofind + " is found ");
        } else {
            System.out.println(tofind + " is not found ");
        }
    }
}
