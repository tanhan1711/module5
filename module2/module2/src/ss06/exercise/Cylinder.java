package ss06.exercise;

public class Cylinder extends Circle{
    public double Height;
    public double Volume;
    public Cylinder(double radius, String color,double Height) {
        super(radius, color);
        this.Height=Height;
    }
    public double getVolume(){
        return Volume = (PI*radius*radius*Height);
    }
    public String toString() {
        return "Cylinder{" +
                "radius=" + radius +
                ", color=" + color +
                ", Height=" + Height +
                ", Volume=" + getVolume() +
                '}';
    }

    }
