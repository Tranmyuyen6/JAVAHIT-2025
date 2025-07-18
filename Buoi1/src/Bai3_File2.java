import java.util.Scanner;

public class Bai3_File2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập kích thước ma trận nxn: ");
        int n = sc.nextInt();
        sc.nextLine();
        int[][] a = new int[n][n];
        int value = 1;
        int top = 0, bottom = n - 1;
        int left = 0, right = n - 1;

        while (value <= n * n) {
            for (int i = left; i <= right; i++) {
                a[top][i] = value++;
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                a[i][right] = value++;
            }
            right--;
            for (int i = right; i >= left; i--) {
                a[bottom][i] = value++;
            }
            bottom--;
            for (int i = bottom; i >= top; i--) {
                a[i][left] = value++;
            }
            left++;
        }
        System.out.println("ma trận xoắn ốc " + n + "x" + n + " :");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
