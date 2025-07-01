import java.util.Scanner;
import java.util.Arrays;

public class Arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sizeOfArr = sc.nextInt();   //specify the size of the Array
        int [] arr = new int[sizeOfArr];    //string the array elements in a variable

        //input of elements thru For loop
        for (int i=0;i<sizeOfArr;i++) {
            arr[i] = sc.nextInt();
        }
        //System.out.println("Element at index 3 is: "+arr[3]); //accessing a single element

        //print all the elements
        for (int i=0;i<sizeOfArr;i++) {
            System.out.println(arr[i]);
        }

        System.out.println(Arrays.toString(arr));
        sc.close();
    }
}
