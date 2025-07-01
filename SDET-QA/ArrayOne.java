import java.util.*;
public class ArrayOne {
    public static void main(String[] args) {
        
        int[]arr = {9,18,27,36,45,54};
        arr[0]=90;
        arr[1]=180;

        String strArr = Arrays.toString(arr);
        int lenArr = arr.length;
        System.out.println(strArr);
        System.err.println(lenArr);

    }
}
