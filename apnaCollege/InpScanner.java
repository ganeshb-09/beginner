import java.util.Scanner;
import java.util.Arrays;

public class InpScanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("Enter an integer:");
//		int n = sc.nextInt();
//		System.out.println("The integer number is "+n);
		
//		System.out.println("Enter an double value:");
//		double n = sc.nextDouble();
//		System.out.println("The double value is "+n);
System.out.println("Enter the size of the Array:");
		int n = sc.nextInt();
		
		int a[] = new int[n];
		
		for (int i=0;i<n;i++) {
			System.out.println("Enter a value for the position "+i+":");
			a[i] = sc.nextInt();
		}
        System.out.println("The Array of given inputs is:");
		System.out.println(Arrays.toString(a));
		sc.close();
	}
}
