public class Name {
    public static void main(String[] args) {
        String my = "My";
        String name = "name";

        //concatenation
        // String myName = my + name;
        // System.out.println(myName);

        String jyothsna = my.concat(name);
        System.out.println(jyothsna);

        //length
        int len = jyothsna.length();
        System.out.println(len);

        //substring (starts from beginIndex, ends just one before the endIndex )
        String subStr = jyothsna.substring(2, 6);
        System.out.println(subStr);

        String message = "Welcome to Java";
        String part = message.substring(0, 5);
        System.out.println(part);
        //substring (prints from index 4)
        System.out.println(jyothsna.substring(4));
    }
}
