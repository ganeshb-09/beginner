class Team {                                //OOPS one shot 24 min, rules for Function Overloading
    String name;                            //same function name (teamInfo) is used multiple times whic is called overloading
    int age;                                //either the return type shd be diff. or the passing parameters shd be diff
                                            //this is called compile time polymorphism
    public void teamInfo(String name) {     //but in runtime polyM. errors can't be detected at compile stage, but throws errors during runtime whic is dangerous
        System.out.println(name);           //preffered - Compile time PolyM.
    }

    public void teamInfo(int age) {
        System.out.println(age);
    }

    public void teamInfo(String name, int age) {
        System.out.println(name + " is " + age + " years old.");
    }
}

public class FuncOverload {
    public static void main(String[] args) {
        Team p1 = new Team();

        p1.name = "Rohith";
        p1.age = 36;

        p1.teamInfo(p1.name, p1.age);
    }
}
