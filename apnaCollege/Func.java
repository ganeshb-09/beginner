import java.util.*;

public class Func {
    public static int addition(int a, int b) {
        int sum = a+b;
        return sum;
    }

    public static float prodAB(float c, int b) {
        float prod = c*b;
        return prod;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // System.out.println("Enter a value for a");
        // int a = sc.nextInt();
        System.out.println("Enter a value for b");
        int b = sc.nextInt();
        System.out.println("Enter a value for c");
        float c = sc.nextFloat();

        // int sum = addition(a, b);
        // System.out.println("The sum of 'a' and 'b' is: " + sum);

        float prod = prodAB(c, b);
        System.out.println("The product of c and b is: " + prod);
        sc.close();
    }
}
