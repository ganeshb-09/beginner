class InnerMethods1 {
    int length;
    int width;

    public void polygonType() {
        if (length == width) {
            System.out.println("The given polygon is a Square...");
        } else {
            System.out.println("The given polygon is a Rectangle...");
        }
    }
    
}

public class Methods1 {

    public static void main(String[] args) {
        InnerMethods1 polygon = new InnerMethods1();
        polygon.length = 9;
        polygon.width = 5;

        InnerMethods1 polygon2 = new InnerMethods1();
        polygon.length = 9;
        polygon.width = 9;

        polygon.polygonType();

        polygon2.polygonType();
    }
}