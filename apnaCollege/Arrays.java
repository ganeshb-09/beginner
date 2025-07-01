import java.util.*;
import java.util.Arrays;

public class Arrays {
    public static void main(String[] args) {
        /* one way of declaring and accessing the array variables
        int marks[] = new int[3];   //3 is size of the Array
        marks[0]=99;
        marks[1]=90;
        marks[2]=81; 
        System.out.println(marks[0]);   //access the marks by index value
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        */
        //another way of array decl.
        //int marks[] = {99,90,81};

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int num[] = new int[size];

        //for reading the input thru scanner
        for (int i=0;i<size;i++) {
            num[i] = sc.nextInt();
        }

        //for printing the o/p
        System.out.println("The elements in the array are:");
        for (int i=0;i<size;i++) {
            System.out.println(num[i]);
        }

        //System.out.println(Arrays.toString(num));

        //print the num at given index

        /*System.out.println("enter desired index value: ");
        int x = sc.nextInt();
        for (int i=0; i<num.length;i++) {
            if (num[i]==x) {
                System.out.println("x found at index : " + i);
            }
        } */
    }
}
