package day10;
import packagename.classname;                   //if we are trying to execute Obj. from external package.

public class EmployeeMain {
    public static void main(String[] args) {
        OOPday1 emp1 = new OOPday1();           //Object
        emp1.eid = 2339298;
        emp1.name = "Ganesh";
        emp1.job = "Testing";
        emp1.salary = 1800000;
        System.out.println("Data of emp1 is:");
        emp1.display();

        OOPday1 emp2 = new OOPday1();
        emp2.eid = 2339399;
        emp2.name = "Ayyappa";
        emp2.job = "Developer";
        emp2.salary = 2700000;
        System.out.println("Data of emp2 is:");
        emp2.display();
    }
}
