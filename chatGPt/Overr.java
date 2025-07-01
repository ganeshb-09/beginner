class Pro {
    void add(int a, int b) {
        System.out.println("Pro class add method: " + (a*b));
    }
}
class Sub extends Pro{
    void add(int a, int b) {
        System.out.println("Sub class add method: " + (a-b));
    }
}

class Super extends Sub{
    void add(int a, int b) {
        System.out.println("Sub class add method: " + (a+b));
    }
}


public class Overr {
    public static void main(String[] args) {
        Sub obj = new Sub();
        Pro pro = new Pro();

        // obj.a = 10;
        // obj.b = 5;
        pro.add(10, 5);
    }
}
