package homework_week_7;
//java program to sort a numeric array and string array

import java.util.Arrays;

public class Class17 {
    public static void main(String[] args) {
        sortArray();
    }
    public static void sortArray() {
        int[] arraydata1 = {
                1789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472, 2365, 1456, 2156, 1457, 2456};
        String[] arraydata2 = {
                "java", "Python", "PHP", "C#", "C Programming", "C++"
        };
        System.out.println("Original numeric array : " + Arrays.toString(arraydata1));
        Arrays.sort(arraydata1);
        System.out.println("Sorted numeric array : " + Arrays.toString(arraydata1));

        System.out.println("Original numeric array : " + Arrays.toString(arraydata2));
        Arrays.sort(arraydata2);
        System.out.println("Sorted string array : " + Arrays.toString(arraydata2));
    }
}
