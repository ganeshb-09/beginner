import java.util.Arrays;
import java.util.Scanner;

public class ArConc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //First Array thru scanner
        System.out.println("Enter the size of the first Array:");
        int n1 = sc.nextInt();
        int arr1[] = new int[n1];

        System.out.println("Enter the elements of the first Array:");
        for (int i=0; i<n1; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("The first Array is: " + Arrays.toString(arr1));

        //Second Array thru scanner
        System.out.println("Enter the size of the second Array:");
        int n2 = sc.nextInt();
        int arr2[] = new int[n2];

        System.out.println("Enter the elements of the second Array:");
        for (int i=0; i<n2; i++) {
            arr2[i] = sc.nextInt();
        }
        System.out.println("The second Array is: " + Arrays.toString(arr2));

        //concatenating the Arrays
        int concatArr[] = new int[arr1.length + arr2.length];
        int index = 0;
        for (int x:arr1) {
            concatArr[index++] = x;
        }
        for (int y:arr2) {
            concatArr[index++] = y;
        }
        System.out.println("The concatenated Array is: " + Arrays.toString(concatArr));
    }
}
