class Var {
    String name;
    int cost;
    double version;

    public void specifications(String name) {
        System.out.println(name);
    }

    public void specifications(String name, int cost) {
        System.out.println("Name is " +name + " "+  "cost is " +cost);
    }
}

public class Mobile {
    public static void main(String[] args) {
        Var m1 = new Var();
        m1.name = "MyPhone";
        m1.cost = 27000;

        m1.specifications(m1.name);

        m1.specifications(m1.name, m1.cost);
    }
}
