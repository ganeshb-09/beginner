import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for (int i=1;i<=n;i++) {
            if (i%2==0) {
                System.out.println(i + " is an even number");
            }else if (i%3==0) {
                System.out.println("Yess..." + i + " is divisible by 3");
            }else if (i%4==0) {
                System.out.println("Of course " +i+" is divisible by both 2 and 4");
            }
        }
    }
}
