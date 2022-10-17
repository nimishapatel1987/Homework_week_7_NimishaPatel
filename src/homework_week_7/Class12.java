package homework_week_7;
//program that tells us input value is number or an alphabet or symbol

public class Class12 {
    static void charCheck(char input_char) {

        //CHECKING FOR AlPHABET
        if ((input_char >= 65 && input_char <= 90)
                || (input_char >= 97 && input_char <= 122))
            System.out.println(" Alphabet ");

            //CHECKING FOR NUMBER
        else if (input_char >= 48 && input_char <= 57)
            System.out.println(" Number ");

            //CHECKING FOR SYMBOL
        else
            System.out.println(" Symbol ");
    }
    //Driver code
    public static void main(String[] args) {
        char input_char = '$';
        charCheck(input_char);
    }
}
