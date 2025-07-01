class Product {
    String name;
    int cost;
    double version;

    public void productInfo(String name) {
        System.out.println("The name of the product is " + name);
    }

    public void productInfo(int cost) {
        System.out.println("The product costs " + cost + " INR");
    }

    public void productInfo(String name, int cost) {
        System.out.println("The price of " + name + " is " + cost + " INR");
    }

    public void productInfo(double version) {
        System.out.println("The version of the product is " + version);
    }
}

public class FuncOverloadPractice {
    public static void main(String[] args) {
        Product p1 = new Product();

        p1.name = "Vivo";
        p1.cost = 27000;
        p1.version = 2024.18;

        p1.productInfo(p1.name, p1.cost);
        p1.productInfo(p1.version);
    }
}
