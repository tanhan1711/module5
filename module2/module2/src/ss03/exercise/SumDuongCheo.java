package ss03.exercise;

import java.util.Scanner;

public class SumDuongCheo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m ,n;
        int sum=0;
        System.out.println("Nhap vao so cot:");
        m = scanner.nextInt();
        System.out.println("Nhap vao so dong:");
        n=scanner.nextInt();
        int [][] A = new int[m][n];

        System.out.println("Nhập các phần tử cho ma trận: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("arr[" + i + "]["+ j + "] = ");
                A[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    sum += A[i][j];
                }
            }
        }

        System.out.println("Tổng các phần tử nằm trên đường chéo chính = " + sum);
    }
}
