package ss03.exercise;

import java.util.Scanner;

public class SumColum {
    public static void main(String[] args) {
        int m ,n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so cot:");
        m = scanner.nextInt();
        System.out.println("Nhap vao so dong:");
        n=scanner.nextInt();
        int [][] arr = new int[m][n];

        System.out.println("Nhập các phần tử cho ma trận: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("arr[" + i + "]["+ j + "] = ");
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Ma trận  vừa nhập:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println("\n");
        }
        System.out.println("Nhap vao cot can tinh:");
        int col = scanner.nextInt();
        int sum=0;
        for (int i = 0; i <n ; i++) {
            sum=sum+arr[i][col-1];
        }
        System.out.println(+sum);
    }
}
