package test.Xoakhoangtrang;

import java.util.Scanner;

public class XoaKhoangTrang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap chuoi :");
        String a = sc.nextLine();
        System.out.println("Chuoi ban dau:"+a);
        a = a.replaceAll(" ","");
        System.out.println("Chuoi sau khi sua:"+a);

    }
}
