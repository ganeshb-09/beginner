import java.util.*;
import java.util.Arrays;
public class EvenArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};

        //Extract even and odd num
        for (int i=0;i<arr.length;i++) {
            if (arr[i]%2==0) {
                System.err.println(arr[i] + " is Even");
            }else {
                System.out.println(arr[i]+" is Odd");
            }
        }
    }
}
