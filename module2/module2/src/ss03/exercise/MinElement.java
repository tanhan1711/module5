package ss03.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MinElement {
    public static void main(String[] args) {
        int m;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so phan tu:");
        m = scanner.nextInt();
          int [] arr = new int[m];

        System.out.println("Nhập các phần tử cho ma trận: ");
        for (int i = 0; i < m; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        int min = arr[0];
        for (int i = 1; i <arr.length ; i++) {
            if (min>arr[i]){
                min = arr[i];
//                arr[i]=min;
            }
        }
        System.out.println("gia tri nho nhat"+min);
    }
}


