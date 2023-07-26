package ss05.exercise;

import java.util.Scanner;

public class Accessmodifier {
    private double radius = 1.0;
    private String color = "red";
    private final  float PI = 3.14f;
    public Accessmodifier(double radius) {

        this.radius = radius;
    }
    public void Accessmodifier(){
    }

    public double getRadius(){

        return radius;
    }
    public double getArea(){
        double area = radius*radius*PI;
        return area;
    }
    public void display(){
        System.out.println(getArea());
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao ban kinh:");
        double radius =Double.parseDouble(scanner.nextLine());
        Accessmodifier accessmodifier = new Accessmodifier (radius);
        accessmodifier.display();

    }
}
