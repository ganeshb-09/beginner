class Calculator {
    int a;                                  // variable named a
    public int add(int n1, int n2){         //method named add
        int r = n1 + n2;
        return r;
    }
}


public class Demo {
    public static void main(String a[]){
        int num1 = 8;
        int num2 = 10;

        Calculator obj1 = new Calculator(); //object created

        int result = obj1.add(num1, num2);

        //obj1.add();

        //int result = num1+num2;
        System.out.println(result);
        
    }
}
