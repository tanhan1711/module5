package ss03.exercise;

import java.util.Scanner;

public class ChenArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = 20; // Suc chua cua mang
        int index = 3;
        int[] arr = new int[size];
        arr[0] = 1;
        arr[1] = -1;
        arr[2] = 6;
        arr[3] = 5;
        arr[4] = 3;
        int n = 5; // So luong phan tu trong mang hien tai
        int x = 10;
        System.out.print("Truoc khi them: ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        // Inserting key
        n = insertToPos(arr, size, n, x, index);
        System.out.print("\nSau khi them: ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }


    static int insertToPos(int[] arr, int size, int n, int x, int index) {
        // Neu so luong phan tu lon hon hoac bang suc chua cua mang thi khong the them
        if (n >= size) {
            return n;
        }
        // vi tri them phan tu phai thuoc khoang[0, n]
        if (index < 0 || index > n) {
            return n;
        } else {
            for (int i = n; i > index; i--) {
                arr[i] = arr[i - 1];
            }
        }
        // them X vao vi tri postision cua mang
        arr[index] = x;
        return n + 1; // tang so luong phan tu cua mang them 1
    }
}