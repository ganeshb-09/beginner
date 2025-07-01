import java.util.*;

public class Samp {
    int x;
    int y;

    void prodXY() {
        System.out.println("The product of x & y is: "+x*y);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Samp obj = new Samp();
        System.out.println("Enter value of x: ");
        obj.x = sc.nextInt();

        System.out.println("Enter value of y: ");
        obj.y = sc.nextInt();

        obj.prodXY();
    }
}
