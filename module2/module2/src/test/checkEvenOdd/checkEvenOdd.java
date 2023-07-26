package test.checkEvenOdd;

import java.util.Scanner;

public class checkEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        do {
            System.out.println("\n\nNhập vào số cần kiểm tra: ");
            num1 = sc.nextInt();
        } while (num1 > 10000 || num1 < 99);
        // Kiểm tra đối xứng
        boolean isPalindrome = true;
        String strN = Integer.toString(num1);
        int len = strN.length();
        for (int i = 0; i < len/2; i++) {
            if (strN.charAt(i) != strN.charAt(len-1-i)) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("N la so doi xung.");
        } else {
            System.out.println("N khong phai la so doi xung.");
        }
// Kiểm tra chứa chữ số lẻ
        boolean hasOddDigit = false;
        while (num1 > 0) {
            int digit = num1 % 10;
            if (digit % 2 == 1) {
                hasOddDigit = true;
                break;
            }
            num1 /= 10;
        }
        if (hasOddDigit) {
            System.out.println("N chua chu so le.");
        } else {
            System.out.println("N khong chua chu so le.");
        }
    }

}

