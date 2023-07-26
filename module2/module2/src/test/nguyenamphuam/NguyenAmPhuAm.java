package test.nguyenamphuam;

import java.util.Scanner;

public class NguyenAmPhuAm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi b nhap ki tu:");
        char ch=sc.next().charAt(0);
        switch (ch){
            case 'a' :
            case 'e' :
            case 'i' :
            case 'o' :
            case 'A' :
            case 'E' :
            case 'I' :
            case 'O' :
                System.out.println("day la phu am");
                break;
            default:
                System.out.println("day la nguyen am");
        }

    }
}
