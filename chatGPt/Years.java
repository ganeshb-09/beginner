import java.util.*;
public class Years {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of the days to be converted:");
        int n = sc.nextInt();

        int years = n/365;
        int weeks = (n%365)/7;
        int days = n-((years*365)+(weeks*7));
        System.out.println(years + " Years" );
        System.out.println(weeks + " Weeks" );
        System.out.println(days + " Days" );
    }
}
