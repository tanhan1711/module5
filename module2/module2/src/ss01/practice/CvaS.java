package ss01.practice;

import java.util.Scanner;

public class CvaS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chieu dai");
        float width = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap chieu rong");
        float height = Integer.parseInt(scanner.nextLine());
        float c = (width+height)*2;
        float s = width*height;
        System.out.println("chu vi hinh chu nhat:"+c);
        System.out.println("dien tivh hinh chu nhat la:"+s);
    }
}
