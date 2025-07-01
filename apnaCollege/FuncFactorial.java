import java.util.Scanner;

public class FuncFactorial {
    public static void factorial(int n) {
        int factorial = 1;

        for (int i=n; i>=1; i--) {
            factorial = factorial*i;
        }
        System.out.println("The factorial of the entered number is: " + factorial);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to get the factorial:");
        int n = sc.nextInt();
        factorial(n);
    }
}
