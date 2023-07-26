package ss05.exercise;

import java.util.Scanner;

public class Student {
    private String name = "John";
    private  String classes ="C02";

    public Student() {
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setClasses(String classes) {
        this.classes = classes;
    }

    public String getName() {
        return name;
    }

    public String getClasses() {
        return classes;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();
        student.setName("Nhan");
        student.setClasses("A08");
        student.getName();
        student.getClasses();
        System.out.println(student.getName());
        System.out.println(student.getClasses());
    }
}
