import java.util.*;
class Product {
    String name;
    double price;
    int qty;

    //constructor
    public Product(String name, double price, int qty) {
        this.name = name;
        this.price = price;
        this.qty = qty;
    }

    //Method to display product details
    public void productDetails() {
        System.out.println("Product name is: " + name);
        System.out.println("Product price is: " + price);
        System.out.println("Product qty is: " + qty);
    }

    // Method to apply discount
    public boolean productAvl() {
        return qty > 0;
    }

    public double applyDiscount() {
        return price*0.981;
    }

}

class ElectronicProduct extends Product {
    String brand;
    int warranty;   //in months

    //constructor
    public ElectronicProduct(String name, double price, int qty, String brand, int warranty) {
        super(name, price, qty);
        this.brand = brand;
        this.warranty = warranty;
    }

    //Overriden method to display Product details
    @Override
    public void productDetails() {
        super.productDetails();
        System.out.println("Brand is " + brand);
        System.out.println("Warranty period is: "+ warranty + " months.");
    }

    //Overriden method to apply discount on Electronic products
    @Override
    public double applyDiscount() {
        //10% discount on electronic
        return price*0.9;
    }
}

public class StoreInventory {
    public static void main(String[] args) {
        //create product objects
        Product p1 = new Product("T-Shirt", 890, 3);
        ElectronicProduct p2 = new ElectronicProduct("Laptop", 89000, 1, "Dell", 36);
        ElectronicProduct p3 = new ElectronicProduct("Mobile", 27000, 1, "Vivo", 24);

        //Array to store the products
        Product[] inventory = {p1, p2, p3};

        //Display the menu
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Store Inventory Menu ---");
            System.out.println("1. View All Products");
            System.out.println("2. Check Product Availability");
            System.out.println("3. Apply Discount");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    //view all products
                    for (Product product : inventory) {
                        product.productDetails();
                        System.out.println("----------------------");
                    }
                    break;
                case 2:
                    //check product avl.
                    System.out.println("Enter product name to check the availability: ");
                    String name = sc.nextLine();
                    boolean found = false;
                    for (Product product : inventory) {
                        if (product.name.equalsIgnoreCase(name)){
                            if (product.productAvl()){
                                System.out.println(name + " is available.");
                            } else {
                                System.out.println(name + " is out of stock.");
                            }
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Product not found..!!");
                    }
                    break;
                case 3:
                    //Apply discount
                    System.out.print("Enter product name to apply discount: ");
                    name = sc.nextLine();
                    found = false;
                    for (Product product : inventory) {
                        if (product.name.equalsIgnoreCase(name)){
                            double discountedPrice = product.applyDiscount();
                            System.out.println("The discounted price of " + name + " is: $" +discountedPrice);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Product not found");
                    }
                    break;
                case 4:
                    System.out.println("Exciting...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again...");
            }
        } while (choice != 4);
        sc.close();
    }
    
}
