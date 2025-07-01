class Pens {                                    //blue print of the object, consists of properties of obj.
    String color;                               //defining properties
    String type;                                //ballpont,gel
    int cost;

    public void write() {                       //function (what a pen does)
        System.out.println("writing HariOm");
    }

    public void printColor() {                  //function to print the prop.
        System.out.println(this.color);         //"this" is reserved keyword in java, and used to call the objects
    }

    public void penCost() {
        System.out.println(this.cost);
    }
}

class Students {                                //another class called students
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    // Students() {                                //non parameterized cons.
    //     System.out.println("constructor called...");
    // }

    Students(String name, int age) {               //parameterized cons.
        this.name = name;
        this.age = age;
    }
}

public class Oops1 {
    public static void main(String[] args) {
        Pens pen1 = new Pens();                 //obj. created
        pen1.color = "blue";                    //using a "." we added properties to obj.
        pen1.type = "gel";
        pen1.cost = 90;

        //pen1.write();                           //calling the function is also using "."

        Pens pen2 = new Pens();
        pen2.color = "white";
        pen2.type = "ballpoint";
        pen2.cost = 54;

        // pen1.printColor();
        // pen2.printColor();
        // pen1.penCost();

        Students s1 = new Students("Ganesh" , 28);           //Students - constructor,cons. name shd be same as class name
                                                //3 types of cons. parameterized, non-parameterized, copy cons.
                                                //cons. don't return anything, void is also not needed //cons. is only called one
        // s1.name = "Ganesh";
        // s1.age = 28;

        s1.printInfo();
    }
}
