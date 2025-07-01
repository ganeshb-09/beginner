public class SearchArr {
    public static void main(String[] args) {
        String[] arr = {"java","python","C","C++","Ruby"};

        String s = "java";

        for (String i:arr) {
            if (i==s) {
                System.out.println(i);
            }
        }
    }
}
