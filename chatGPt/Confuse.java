import java.util.Scanner;

public class Confuse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();

        if (n>=200) {
            System.out.println("200+");
        } else if (n>=150) {
            System.out.println("150+");
        } else if (n>=100) {
            System.out.println("100+");
        } else {
            System.out.println("<=100");
        }
    }
}
