package test.Nhan2so;

import java.util.Scanner;

public class multi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("moi nhap gia tri a:");
        int a = Integer.parseInt(sc.nextLine());
        System.out.println("moi nhap gia tri b:");
        int b = Integer.parseInt(sc.nextLine());
        int multi = a * b ;
        System.out.println(multi);
    }



}
