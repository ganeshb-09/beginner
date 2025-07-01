class CarSpec {
    String brand;
    int cost;
    String color;
    double version;

    public void carInfo(String brand) {
        System.out.println(brand);
    }

    public void carInfo(int cost) {
        System.out.println(cost);
    }

    // public void carInfo(String color) {
    //     System.out.println(color);
    // }

    public void carInfo(double version) {
        System.out.println(version);
    }

    public void carInfo(String brand, int cost) {
        System.out.println(brand +" "+ cost);
    }

}

public class PolyM {
    public static void main(String[] args) {
        CarSpec car = new CarSpec();
        car.brand = "TATA";
        car.cost = 900000;
        car.color = "Grey";
        car.version = 2024.11;

        car.carInfo(car.brand, car.cost);
    }
    
}
