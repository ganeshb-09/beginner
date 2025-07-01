class Properties {
    int a;
    int b;
    int c;
    int ab;
    int bc;
    int ca;

    public void equilateralTriangle() {
        if (a==b && b==c) {
            System.out.println("The given triangle is an Equilateral Triangle");
        }
    }

    public void isoscelesTriangle() {
        if (a==b || b==c || c==a) {
            System.out.println("The given triangle is an Isosceles Triangle");
        } else {
            System.out.println("Not a Isosceles Triangle");
        }
    }

    public void scelenTriangle() {
        if (a!=b && b!=c && c!=a) {
            System.out.println("The given triangle is an Scelene Triangle");
        } else {
            System.out.println("Not a Scelene Triangle");
        }
    }
}

public class Polygon {
    public static void main(String[] args) {
        Properties triangle1 = new Properties();

        triangle1.a = 9;
        triangle1.b = 9;
        triangle1.c = 9;

        Properties triangle2 = new Properties();
        triangle2.a = 9;
        triangle2.b = 8;
        triangle2.c = 8;

        triangle2.isoscelesTriangle();
    }
}
