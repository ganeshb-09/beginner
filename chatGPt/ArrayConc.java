import java.util.Arrays;
import java.util.Scanner;

public class ArrayConc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr1[] = {21,62,36};
        int arr2[] = {45,45,63};
        int concArr[] = new int[arr1.length + arr2.length];
        int index = 0;
        
        for (int x:arr1) {
            concArr[index++] = x;
        }
        for (int y:arr2) {
            concArr[index++] = y;
        }
        System.out.println(Arrays.toString(concArr));
    }
}
