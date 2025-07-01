
import java.util.Scanner;

public class ArrTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int arr[][] = new int[rows][cols];

        //taking inputs thru Scanner
        for (int i=0; i<rows; i++) {
            for (int j=0; j<cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Element at the index is "+(arr[2][3]));

        //find the index at given num
        System.out.println("Enter the X :");
        int x = sc.nextInt();

        //for output
        for (int i=0; i<rows; i++) {
            for (int j=0; j<cols; j++) {
                //compare with X
                if(arr[i][j]==x) {
                    System.out.println(x + " X found at locations ("+ i +"," + j +")");
                }
            }
        }

        //print even num in the array
        System.err.println("Here are the seperated evn an odd numbers from the array:");

        //count the prime
        int primeCount = 0;
        for (int i=0; i<rows; i++) {
            for (int j=0; j<cols; j++) {
                if (arr[i][j]%2==0) {
                    System.out.println("Even numbers in the given array are: " +arr[i][j]);
                    primeCount++;
                }else {
                    System.out.println("Odd numbers in the given array are: " +arr[i][j]);
                }
            }
        }
    }
}
