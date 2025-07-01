import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number print the even and odd numbers within the range:");
        int n = sc.nextInt();
        int evenCount = 0;
        int oddCount = 0;
        for (int i=1;i<=n;i++) {
            if (i%2==0) {
                System.out.println(i + " is an Even Number");
                evenCount++;
            }else {
                System.out.println(i + " is an Odd Number");
                oddCount++;
            }
        }
        System.out.println("The count of Even numbers is " + evenCount);
        System.out.println("The count of Odd numbers is " + oddCount);
    }
}
