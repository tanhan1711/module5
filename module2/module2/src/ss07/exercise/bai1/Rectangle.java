package ss07.exercise.bai1;

public class Rectangle extends Shape implements IResizeable{
    public double perimeter;
    public double area;
    public Rectangle(double radius, String color, double lenght, double width) {
        super(radius, color, lenght, width);
    }

    public double getPerimeter() {
        return perimeter = lenght+width;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public double getArea() {
        return area = lenght*width;
    }

    public void setArea(double area) {
        this.area = area;
    }
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color=" + color +
                ", area=" + getArea() +
                ", Perimeter=" + getPerimeter() +
                '}';
    }

    @Override
    public void resize(double percent) {
        percent = Math.floor(Math.random()* 100);
        width = width * percent;
        lenght = lenght * percent;
        System.out.println(percent);
        getArea();
    }
}

