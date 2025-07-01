//class 1

import java.util.Scanner;

class OverLoad {
    int add(int a, int b) {
        return (a+b);
    }

    int add(int a, int b, int c) {
        return (a+b+c);
    }

    double add(double a, double b) {
        return (a+b);
    }
}

//class 2
class OverRide {
    int n;

    void car() {
        System.out.println("Cars are bigger.");
    }
}
//child class of class 2
class Child1 extends OverLoad {
    int y;
    int add(int a, int b) {
        return (a+b); 
    }
    void car() {
        System.out.println("Cars are bigger than bikes...!");
    }
    //Method Override
    int add(int n, int y, int a) {
        return (n+y-a);
    }
}
//child class of class 2
class Child2 extends OverRide {
    void car() {
        System.out.println("Cars are bigger than bikes but smaller than buses...!!!");
    }
}

public class MathOL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Child1 Obj1 = new Child1();
        OverRide Obj2 = new OverRide();
        OverLoad objC = new OverLoad();

        System.out.println(objC.add(5, 4));
        // System.out.println(objC.add(5, 4, 9));
        // System.out.println(objC.add(95.6, 46.8));

        System.out.println("Type value for n:");
        Obj2.n = sc.nextInt();
        System.out.println("Type value for y:");
        Obj1.y = sc.nextInt();
        //Obj1.a = 6;
        System.out.println("The value after the math operation is: "+ Obj1.add(Obj2.n, Obj1.y, 10));

    }    
}
