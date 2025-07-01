import java.util.*;
import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the Array:");
        int n = sc.nextInt();
        int[] arrInt = new int[n];

        //input of elements thru scanner
        for (int i=0; i<n; i++) {
            arrInt[i] = sc.nextInt();
        }

        System.out.println("The Array is:" + Arrays.toString(arrInt));

        //output of elements
        for (int i=0; i<n; i++) {
            if (arrInt[i]==0) {
                System.out.println("Don't mess with Zero!!!");
            }
            else if (arrInt[i]%2==0) {
                System.out.println(arrInt[i]+" is an Even number");
            } else {
                System.out.println(arrInt[i] + " is an Odd number");
            }
        }

    }
}
