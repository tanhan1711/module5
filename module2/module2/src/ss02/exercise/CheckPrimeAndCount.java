package ss02.exercise;

import java.util.Scanner;

public class CheckPrimeAndCount {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number:");
        int number = scanner.nextInt();
        int dem = 0; // đếm số số nguyên tố
        int i = 2;   // tìm số nguyên tố bắt dầu từ số 2
        while (dem < number) {
            if (isPrimeNumber(i)) {
                System.out.print(i + " ");
                dem++;
            }
            i++;
        }
    }
            public static boolean isPrimeNumber(int n) {
                // so nguyen n < 2 khong phai la so nguyen to
                if (n < 2) {
                    return false;
                }
                // check so nguyen to khi n >= 2
                int squareRoot = (int) Math.sqrt(n);
                for (int i = 2; i <= squareRoot; i++) {
                    if (n % i == 0) {
                        return false;
                    }
                }
                return true;
            }
        }