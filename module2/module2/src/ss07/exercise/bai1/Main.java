package ss07.exercise.bai1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int x = (int)(Math.floor(Math.random() * 100));
        Scanner scanner = new Scanner(System.in);
        Rectangle rectangle = new Rectangle(3,"yellow",3,3);
        System.out.println(rectangle.getArea());
        rectangle.resize(5);
    }
}
