package test.Conghaisophuc;

import java.util.Scanner;

public class ComplexNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi nhap phan tu that a:");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.println("Moi nhap phan tu ao b:");
        int b = Integer.parseInt(scanner.nextLine());
        System.out.println("Moi nhap phan tu that a1:");
        int a1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Moi nhap phan tu ao b1:");
        int b1 = Integer.parseInt(scanner.nextLine());

        int real = a + a1 ;
        int imp = b + b1 ;
        System.out.println("so phuc la :"+real+"+"+imp+"i");
    }
}
