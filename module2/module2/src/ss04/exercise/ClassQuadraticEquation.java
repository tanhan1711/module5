package ss04.exercise;

import java.util.Scanner;

public class ClassQuadraticEquation {
    private double a, b, c;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public ClassQuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;

    }

    public double getDiscriminant() {
       double delta = b*b-4*a*c;
       return delta;
    }
    public double getRoot1() {
        double x1 = (-this.b + Math.sqrt(Math.pow(this.b, 2) - 4 * this.a * this.c)) / (2 * this.a);
        return x1;
    }
        public double getRoot2(){
        double x2 = (-this.b - Math.sqrt(Math.pow(this.b, 2) - 4 * this.a * this.c)) / (2 * this.a);
        return x2;
    }
    public double getRoot(){
        double x = -b/(2*a);
        return x;
    }
    public void display(){
        double delta = getDiscriminant();
        double x1,x2;
        if (delta>0){
            System.out.println(getRoot1());
            System.out.println(getRoot2());
        }else if (delta==0){
            System.out.println(getRoot());
        }else {
            System.out.println("The equation has no roots");
        }
    }
    public static void main(String[] args) {
        double a,b,c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap a:");
        a=Double.parseDouble(scanner.nextLine());
        System.out.println("Nhap b:");
        b=Double.parseDouble(scanner.nextLine());
        System.out.println("Nhap c:");
        c=Double.parseDouble(scanner.nextLine());
        ClassQuadraticEquation classQuadraticEquation = new ClassQuadraticEquation(a,b,c);
        classQuadraticEquation.display();
    }
}
