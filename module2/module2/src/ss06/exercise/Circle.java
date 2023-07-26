package ss06.exercise;

public class Circle  {
    public double radius;
    public String color;
    public double area;
    public final float PI = 3.14f;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getArea() {
        return area = radius * radius * PI;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color=" + color +
                ", Area=" + getArea() +
                '}';
    }
}
