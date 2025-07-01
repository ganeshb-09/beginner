public class Exception {
    public static void main(String[] args) {
        try {
            // This will cause an ArrayIndexOutOfBoundsException
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[3]); // Accessing out-of-bounds index
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }

        try {
            // This will cause an ArithmeticException
            int result = 10 / 0; // Division by zero
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        }

        try {
            // This will cause a NullPointerException
            String str = null;
            System.out.println(str.length()); // Invoking method on null object
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }
}
