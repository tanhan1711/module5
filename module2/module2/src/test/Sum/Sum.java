package test.Sum;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao n :");
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 1; i < n; i+=2) {
            if (i % 2 != 0) {
                System.out.printf("Cac so le lan luot la"+i);
            }
        }
    }
}
