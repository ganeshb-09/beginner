public class Example {
    
    //method without parameters and return type
    public static void greet() {
        System.out.println("Hari Om, welcome to java programming...!");
    }

    //method with parameters (takes two integers) and returns an integer
    public static int add(int a, int b) {
        return a+b;
    }

    //method with parameters (takes a string and an integer and returns a string)
    public static String repeatString(String str, int times) {
        String result = "";
        for (int i=0; i<times; i++) {
            result += str + " ";
        }
        return result.trim();
    }

    //method with parameters
    public static String repeatName(String name, int repeat) {
        String res = "";
        for (int i= 0; i<repeat;i++) {
            res += name + " " ;
        }
        return res.trim();
    }

    //main method - entry point of java
    public static void main(String[] args) {
        greet();

        //calling add() method (take two integers and returns an integer)
        int sum = add(4, 5);
        System.out.println("The result of the add method is: " + sum);

        //calling the repeatString() method
        String repeated = repeatString("Hari", 8);
        System.out.println("Repeated string " + repeated);

        //calling repeated name
        String callName = repeatName("Ganesh", 5);
        System.out.println("Repeated name is " + callName);
    }
}
