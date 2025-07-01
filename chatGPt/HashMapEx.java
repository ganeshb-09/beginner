import java.util.HashMap;

public class HashMapEx {
    public static void main(String[] args) {
        //create a hashmap and populate it
        HashMap<Integer, String> originalMap = new HashMap<>();
        originalMap.put(1, "Apple");
        originalMap.put(2, "Banana");
        originalMap.put(3, "Cherry");

        //print the original HashMap
        System.out.println("Original HashMap: " + originalMap);

        //second hashmap, to copy data from the first hashmap
        HashMap<Integer, String> copiedMap = new HashMap<>(originalMap);
        
        //Print copied HashMap
        System.out.println("Copied HashMap: "+copiedMap);

    }
}
