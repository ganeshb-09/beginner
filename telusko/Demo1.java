class Mobile {
    int cost;
    int version;
    String brand;

    public void operate() {
        System.out.println("buy this mobile");
    }

    public void mobileInfo() {
        System.out.println(this.cost);
        System.out.println(this.version);
        System.out.println(this.brand);
    }

    Mobile(int cost, int version, String brand) {
        this.cost = cost;
        this.version = version;
        this.brand = brand;
    }
}

public class Demo1 {
    public static void main() {
        Mobile m1 = new Mobile(10000, 04, "MyBrand");
        m1.cost = 100000;
        m1.version = 4;
        m1.brand = "MyBrand";

        m1.mobileInfo();
    }    
}
