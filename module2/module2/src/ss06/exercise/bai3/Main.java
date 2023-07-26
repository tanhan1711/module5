package ss06.exercise.bai3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Point point = new Point(3,3);
        MovablePoint movablePoint = new MovablePoint(3,3,3,3);
        System.out.println(point);
        System.out.println(movablePoint);
    }
}
