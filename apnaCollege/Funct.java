import java.util.*;

public class Funct {
    public static int addAB(int a, int b) {
        int sum = a+b;
        return sum;
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value for a:");
        int a = sc.nextInt();

        System.out.println("Enter value for b:");
        int b = sc.nextInt();

        int sum = addAB(a, b);
        System.out.println("The sum of a & b is : "+sum);
    }
}
