import java.util.*;
import java.util.Arrays;
public class MulArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int [][] arrNum = new int[rows][cols];

        //reading inputs thru Scanner
        for (int i=0; i<rows; i++) {  //for looping thru row num 'i'
            for (int j=0; j<cols; j++) {  //for looping thru row num 'j'
                arrNum[i][j] = sc.nextInt();    //Storing the i-row, j-col elemets in a variable (arrNum)
            }
        }

        //print the output
        for (int i=0; i<rows; i++) {
            for (int j=0; j<cols; j++) {
                //System.out.println(Arrays.toString[(arrNum[i][j] + " ")]);
                System.out.print((arrNum[i][j]) + " ");
            }
            System.out.println();
        }
    }
}
