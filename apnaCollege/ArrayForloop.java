import java.util.Arrays;
import java.util.*;

public class ArrayForloop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();  // n is the number of elements you want to store

        int[] arr = new int[n];   // declaring and creating an array


        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();   // reading inputs for array
        }

        System.out.println(Arrays.toString(arr));
        input.close();
    }
}
