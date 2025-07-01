import java.util.Scanner;

public class ArrTranspose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int arr[][] = new int[cols][rows];

        //input values
        for (int i=0; i<cols; i++) {
            for (int j=0; j<rows; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        //output
        System.out.println("The Transpose Matrix of the Array is:");
        for (int j=0; j<rows; j++) {
            for (int i=0; i<cols; i++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
