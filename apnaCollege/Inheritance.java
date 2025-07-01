class Shape {
    String color;                       //property
    public void area() {
        System.out.println("displays area");
    }
}

class Triangle extends Shape {          //Triangle(sub or child class) will inherit the prop. of Shape(Base class or parent class) class
    public void area(int l, int h) {    //simgle level Inh.
        System.out.println(1/2*l*h);
    }
}

class EquilateralTriangle extends Triangle {
    public void area(int l, int h) {
        System.out.println(1/2*l*h);
    }
    
}

class Circle extends Shape {
    public void area(int r) {
        System.out.println((3.14)*r*r);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();

        t1.color = "Red";
    }
}


//OOPS one shot 26 min
//inheritance will be helpful to reuse of prop.
//4 types of Inheritance
//1. Single Level Inh. (one Base class to One Derived class)
//2. Multi Level Inh. (one Base class to another Derived class to another Derived class)
//3. Hierarchial Inh. (one Base class to many Derived classes)
//4. Hybrid Inh. (all types of Inh. will be going on)


