public class Bank {
    public static void greetCustomer() {
        System.out.println("Dear Customer, Welcome to the Banking platform...");
    }
    
}


public class HyrMethod {
    public static void main(String[] args) {
        greetCustomer greet = new greetCustomer();
        greet();
    }
}
