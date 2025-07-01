class Addition {
    public boolean meth1(int a, int b) {
        int r = a > b;
        return r;
    } 
}

public class Class2 {
    public static void main(String[] args) {
        int n1 = 6;
        int n2 = 12;

        Addition add = new Addition();

        int result = add.meth1(n1, n2);

        System.out.println(result);

    }
}
