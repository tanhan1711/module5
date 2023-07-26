package ss19.bai2;

import java.util.Scanner;

public class CheckRegexNumPhone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String regexClass ="^\\d{2}\\-\\d{9}$";
        System.out.println("Moi nhap so dien thoai");
        String numPhone = sc.nextLine();
        System.out.println(numPhone.matches(regexClass));
        if (numPhone.matches(regexClass)){
            System.out.println("Hop le");
        }else {
            System.out.println("ko hop le");
        }
    }

    }

