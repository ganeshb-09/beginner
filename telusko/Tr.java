public class Tr {
    public static void main(String[] args) {
        int n = 4;
        // System.out.println((n&1)==0); //true
        // System.out.println((n&1)!=0); //false

        //interview
        // String s = "Java, Selenium, TestNG, Cucumber, Maven";

        // String[] str = s.split(",\\s*");

        // for (String res:str) {
        //     System.out.println(res);
        // }

        String [] res = {"Even","Odd"};
        System.out.println(res[n%2]);

    }
}
