class Table {
    String color;
    int width;
    int length;
    String brand;
    int made_year;

    public void usage() {                   //method
        System.out.println(brand);
    }
    
}

public class Practice {               //main function
    public static void main(String[] args) {
        Table t1 = new Table();
        t1.color = "white";
        t1.width = 27;
        t1.length = 36;
        t1.brand = "Bharath";
        t1.made_year = 2024;

        System.err.println();
    }
}
