import java.util.*;
public class SimplePrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        //Loop through numbers from 1 to n
        for (int num=2; num<=n;num++) {
            boolean isPrime = true;

            //check if the current number is prime
            for (int i=2; i<=num/2; i++) {
                if (num%i==0) {
                    isPrime = false;
                    break;
                }
            }
            //if its a prime number, increment the count
            if (isPrime) {
                System.out.println(num);
                count++;
            }
        }
        //print the total count of prime numbers
        System.out.println("Number of prime numbers up to " + n + ": " + count);
    }
}
