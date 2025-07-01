import java.util.*;
public class UniCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int sum = 0;

        for (int i=0;i<s.length();i++) {
            //get the unicode value of the caracter
            char currentChar = s.charAt(i);
            int unicodeValue = (int)currentChar;  //cast the char to int to get its Unicode 

            //Print the char and its Unicode val
            System.out.println("Character" + currentChar + ", Unicode: "+unicodeValue);

            //Add the unicode value to the sum
            sum += unicodeValue;
        }
        System.out.println("Total sum of the Unicode values: "+sum);
    }
}