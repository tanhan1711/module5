package ss01.exercise;

import java.util.Scanner;

public class VNDTradeDOLA {
    public static void main(String[] args) {
        int rate = 23000;
        int vnd ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so tien can doi:");
        int dola = Integer.parseInt(scanner.nextLine());
        vnd = dola * rate;
        System.out.println(+vnd);
    }
}
