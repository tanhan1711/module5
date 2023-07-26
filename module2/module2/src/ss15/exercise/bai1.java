package ss15.exercise;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        do {
            flag = false;
            System.out.println("nhap 3 canh lan luot");
            int a, b, c;
            try {
                System.out.println("Nhap vao canh a");
                a = Integer.parseInt(sc.nextLine());
                System.out.println("Nhap vao canh b");
                b = Integer.parseInt(sc.nextLine());
                System.out.println("Nhap vao canh c");
                c = Integer.parseInt(sc.nextLine());
                checkTriangle(a, b, c);
            } catch (IllegalTriangleException illegalTriangleException) {
                System.out.println(illegalTriangleException.getMessage());
                System.out.println("Nhập lại");
                flag = true;
            } catch (Exception e) {
                flag = true;
                e.printStackTrace();
                System.out.println("Đang nhập chữ¯");
            }
        }while (flag);

    }

    public static void checkTriangle(int a, int b, int c) throws IllegalTriangleException {
        if (a > b + c || b > a + c || c > a + b && a > 0 && b > 0 && c > 0) {
            throw new IllegalTriangleException("Tam giác k hợp lệ");
        } else {
            throw new IllegalTriangleException("Tam giac hop le");
        }
    }
}
