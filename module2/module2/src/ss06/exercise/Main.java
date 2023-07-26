package ss06.exercise;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circle circle = new Circle(3, "yellow");
        System.out.println(circle);
        Cylinder cylinder = new Cylinder(3, "red", 3);
        System.out.println(cylinder);
    }
}

