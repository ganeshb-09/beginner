import java.util.*;
public class Prime {
    
    //method to check if a num is prime
    public static boolean isPrime(int n) {
        if (n<=1) {
            return false;
        }

        //for loop to check the numbers in given range
        for (int i=2; i<=Math.sqrt(n);i++) {
            if (n%i==0) {
                return false;
            }
        }
        return true;    //num is prime if no factors were found
    }

    public static void main(String[] args) {
        int primeCount = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to print the prime numbers till that number:");
        int n = sc.nextInt();
        for (int i=1;i<=n;i++) {
            //use the isPrime method to check if i is a prime
            if(isPrime(i)){
                primeCount++;
                System.out.println(i + " is a Prime Number");
            } else {
                System.out.println(i + " is not a Prime Number");
            }
        }
        System.out.println("The total count of prime numbers is: "+primeCount);
    }

}
