public class Cont {
    public static void main(String[] args) {
        String str = "Ganesh";
        char a = str.charAt(0);
        char b = str.charAt(1);
        char c = str.charAt(2);
        char d = str.charAt(3);
        char e = str.charAt(4);
        char f = str.charAt(5);

        //System.out.println(a1);
        System.out.println("Uppercase:");
        for (int i=0;i<str.length();i++) {
            System.out.println(Character.toUpperCase(str.charAt(i)));
        }

        System.out.println("Lowercase:");
        for (int i=0;i<str.length();i++) {
            System.out.println(Character.toLowerCase(str.charAt(i)));
        }
    }
}
