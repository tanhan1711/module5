package ss07.exercise.bai1;

public abstract class Circle extends  Shape implements IResizeable {
    public final float PI = 3.14f;
    public double area;

    public Circle() {
    }

    public Circle (double radius, String color) {

        super(radius,color);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }
    public double getArea() {
        return area = radius*radius*PI;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color=" + color +
                ", area=" + getArea() +
                '}';
    }

    @Override
    public void resize(double percent) {
        percent = Math.floor(Math.random() * 100);
        radius = percent * radius;


    }
}

