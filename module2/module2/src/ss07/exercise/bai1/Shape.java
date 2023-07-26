package ss07.exercise.bai1;

public class Shape {
    public double radius;
    public String color;
    public double lenght;
    public double width;

    public Shape(double radius, String color, double lenght, double width) {
        this.radius = radius;
        this.color = color;
        this.lenght = lenght;
        this.width = width;
    }

    public Shape(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public Shape() {
    }


}
