import java.util.Scanner;

public class W {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("* ".repeat((2*n)-1));
        for (int i=1;i<n;i++) {
            String leftSpaces = " ".repeat(i);
            String stars      = "* ".repeat(n-i);
            String midSpaces  = "  ".repeat(i-1);
            System.out.println(leftSpaces+stars+midSpaces+stars);
        }
        sc.close();
    }
}
