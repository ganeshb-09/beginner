import java.util.Scanner;

public class CP22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int col = sc.nextInt();
        int find_row = sc.nextInt();
        int find_col = sc.nextInt();
        int arr[][] = new int[rows][col];

        for (int i=0;i<rows;i++) {
            for (int j=0;j<col;j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(arr[find_row][find_col]);
        sc.close();
    }
}
