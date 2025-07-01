class MathOps {
    int a;
    int b;

    //method 1
    int add(int a, int b) {
        return (a+b);
    }
    void add() {
        System.out.println("The sum of a & b is: " + a+b);
    }

    //method 2
    int Prod(int a, int b) {
        return (a*b);
    }
    void Prod() {
        System.out.println("The product of a & b is: " + a*b);
    }

    //method 3
    double Prod(double a, double b) {
        return (a*b);
    }
    void sub() {
        System.out.println("The value of b minus a is: "+ (b-a));
    }

    //method 4
    float div(float a, float b) {
        return (a/b);
    }
    void div() {
        System.out.println("The division of a and be gives: " + (a/b));
    }
}

public class MethodsBasic {
    public static void main(String[] args) {
        MathOps Object = new MathOps();

        Object.a = 6;
        Object.b = 3;

        System.out.println(Object.add(8, 9));
        System.out.println(Object.div(3, 9));
        System.out.println(Object.Prod(9, 18));

        Object.add();

    }
}
