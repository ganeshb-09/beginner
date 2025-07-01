class Pen{                                      //blue print of object
    String color;
    String type;                                //ballpont, gel

    public void write() {                       //methods (functions which are defined inside a class are methods. here writing is the functionality)
        System.out.println("a pen writes again the same thing");
    }

    public void printColor(){
        System.out.println(this.color);
    }
}

class Student{
    String name; 
    int age;

    public void printInfo(){                    //function of Student class
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student() {                                 //non-parameterized constructor
        System.out.println("constructor called");
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
        //this.graduation = graduation;
    }
}

public class OOPS { //main function
    public static void main(String[] args){     //defining objects 
        // Pen pen1 = new Pen();
        // pen1.color = "blue";
        // pen1.type = "gel";

        // Pen pen2 = new Pen();
        // pen2.color = "red";
        // pen2.type = "ballpoint";

        // pen1.printColor(); //calling the function
        // pen2.printColor(); //calling the function

        // Student s1 = new Student(); //constructor for student class, constructors are methods/func. only but don't return any value
        // s1.name = "ganesh";         //constructor can be called when an object is created
        // s1.age = 28;

        Student s1 = new Student();
        s1.name = "Ganesh";
        s1.age = 28;
        //s1.graduation = true;

        s2.name = "Murugan";
        s2.age = 27;

        s1.printInfo();
    }
}
