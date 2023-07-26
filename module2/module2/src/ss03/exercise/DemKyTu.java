package ss03.exercise;

import java.util.Scanner;

public class DemKyTu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String A = "Codelearn";
        System.out.println("nhap vao mot ky tu bat ky:");
        char word = scanner.next().charAt(0);
        int count =0;
        for (int i = 0; i <A.length() ; i++) {
            if(A.charAt(i) == word) {
                count ++;
            }
        }
        System.out.print(count);
    }
    }



