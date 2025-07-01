class Maths {
    int a;
    int b;
    int c;

    public void sum() {
        System.out.println(a+b);
    }

    public int sum(int a, int b, int c) {
        int total = a+b+c;
        return total;
    }
}

public class FuncPr {
    public static void main(String[] args) {
        Maths mObj1 = new Maths();

        mObj1.a = 5;
        mObj1.b = 4;
        mObj1.c = 9;

        //calling the void sum() 6th line
        mObj1.sum();

        //calling the method with parameters
        int result = mObj1.sum(5, 9, 4);
        System.out.println("Sum of a, b, and c: "+result);
    }
}
