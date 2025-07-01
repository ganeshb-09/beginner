class Car {
    String color;
    int cost;

    public void ride() {
        System.out.println("we can go for a long drive");
    }

    public void printColor() {
        System.out.println(this.cost);
    }
}

public class Mymethod {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.color = "red";
        car1.cost = 9000000;

        car1.ride();
    }
}
