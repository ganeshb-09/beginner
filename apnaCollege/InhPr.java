class Broadband {
    String name;
}

class Jio extends Broadband {
    public void speed(int s) {
        System.out.println("The n/w speed of " + name + " is " + s);
    }
}

class Idea extends Jio {
    public void freq(String f) {
        System.out.println("The frequency of " + name + " is " + f);
    }
    
}

public class InhPr {
    public static void main(String[] args) {
        Jio s1 = new Jio();
        Idea s2 = new Idea();

        s1.name = "Jio";
        s1.s = 100;
        s2.name = "Idea";
        s2.s = 30;
        s1.f = "20 Mh";
        s2.f = "18 Mh";

        s1.speed(s1.s);

    }
}
