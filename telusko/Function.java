import java.util.*;

public class Function {
    // public static int calcSum(int a, int b) {
    //     int sum = a+b;
    //     return sum;
    // }
    // public static int calcProduct(int a, int b) {
    //     return a * b;
    // }

    public static void printFactorial(int n) {

        int factorial = 1;
        for (int i=n; i>=1; i--){
            factorial = factorial * i;
        }

        System.out.println(factorial);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        printFactorial(n);
    }
}
