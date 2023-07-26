package ss03.exercise;

import java.util.Scanner;

public class MaxElement {
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
        float max = arr[0][0];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];

                }
                System.out.println("Phần tử lớn nhất trong ma trận = " + max);
            }
        }
//        System.out.println("Phần tử lớn nhất trong ma trận = " + max);
    }
    }

