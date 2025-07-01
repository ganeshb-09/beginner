class Human {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }
    public void setAge(int a) {
        age = a;
    }

    public String getName() {
        return name;
    }
    public void setName(String s) {
        name = s;
    }
    
}

public class Enacpsule {
    public static void main(String[] args) {
        Human obj = new Human();
        obj.setAge(27);
        obj.setName("Ganesh");

        System.out.println(obj.getAge()+ " : " + obj.getName());
    }
}
