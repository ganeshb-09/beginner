public class Infi {
    public static void main(String[] args) {
        // for(int i=0; ; i++){
        //     System.out.println(i);
        // }
        //System.out.println('A'+'B');
        String s = "aeioudAEOIHKU";

        int count = 0;
        String newStr = "";

        for (int i=0; i<s.length();i++) {
            char c = s.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c =='u'
             || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c =='U') {
                count++;    //count the vowels in a string
                newStr += c; //print only vowels
             }
        }
        System.out.println(count);
        System.out.println(newStr);
    }
    
}
