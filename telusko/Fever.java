import java.util.*;
public class Fever {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        float j = sc.nextFloat();

        if (j==96.4) {
            System.out.println("Normal");
        }else if (j >96.4) {
            System.out.println("High Fever");
        }else if (j < 96.4) {
            System.out.println("Low Fever");
        }else {
            System.out.println("Jai Sree Raama");
        }
    }
}
