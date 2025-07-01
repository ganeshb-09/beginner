public class JaggedArray {
    public static void main(String[] args) {
        int[][] jaggedArray = {
            {1, 2, 3},
            {4, 5},
            {6, 7, 8, 9}
        };

        // Find the number of rows (length of the first dimension)
        int numRows = jaggedArray.length;

        // Find the length of the first column (i.e., the length of the first element of each row)
        for (int i = 0; i < numRows; i++) {
            System.out.println("Length of row " + (i + 1) + ": " + jaggedArray[i].length);
        }

        // For example, to get the length of the second column (if it exists in all rows):
        int columnIndex = 1; // Second column (index 1)
        for (int i = 0; i < numRows; i++) {
            if (columnIndex < jaggedArray[i].length) {
                System.out.println("Element at row " + (i + 1) + ", column " + (columnIndex + 1) + ": " + jaggedArray[i][columnIndex]);
            } else {
                System.out.println("No element at row " + (i + 1) + ", column " + (columnIndex + 1));
            }
        }
    }
}
