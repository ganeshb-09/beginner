import java.util.Scanner;

public class Rec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to print the shape: ");
        int n = sc.nextInt();

        for (int i=1;i<=n;i++) {
            System.out.println("*  ".repeat(n));
        }
        sc.close();
    }
}
